package learn.hanjc.basicadvisor;

import learn.hanjc.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdvisorTest {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("basic-advisor-config.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-auto-proxy-config.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.create("newUser", "newpwd");
        userService.login("admin" , "security");
        userService.create("testUser", "a_test");
    }
}
