#set($symbol_pound='#')
#set($symbol_dollar='$')
#set($symbol_escape='\' )
package ${package}.test.web;

import ${package}.web.controller.UserInfoController;
import ${package}.web.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by ${userName} on ${today}.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(
        value = {"server.port=8080"},
        classes = {Application.class},
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT
)
public class DemoWebTest {

    @Resource
    private UserInfoController userInfoController;

    @Test
    public void test() {
        System.out.println(userInfoController);
    }
}
