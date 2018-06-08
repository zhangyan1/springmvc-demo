#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.client.common.aop;

import ${package}.client.common.util.Profiler;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by ${userName} on ${today}.
 */
public class PerformanceInner implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        String name = String.format("%s-%s", invocation.getThis().getClass().getSimpleName(), invocation.getMethod().getName());

        Profiler.enter(name);
        try {
            return invocation.proceed();
        } finally {
            Profiler.release();
        }
    }
}
