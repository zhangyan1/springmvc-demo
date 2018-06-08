#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.client.common.aop;

import ${package}.client.common.util.Profiler;
import ${package}.client.common.util.Profiler.entry;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by ${userName} on ${today}.
 */
@Slf4j
public class PerformanceOuter implements MethodInterceptor {
    private @Getter @Setter int threshold = 1000;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        String name = String.format("%s-%s", invocation.getThis().getClass().getSimpleName(), invocation.getMethod().getName());
        Entry start = Profiler.getEntry();
        if(start == null) {
        	Profiler.start(name);
        }
        try {
            return invocation.proceed();
        } finally {
        	if(start == null) {
        		Profiler.release();
                long duration = Profiler.getDuration();
                if (duration > threshold) {
                    log.info("{}:{}", name, Profiler.dump());
                }
                Profiler.reset();
        	} 
        }
    }
}
