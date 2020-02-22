package learn.hanjc.introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IntroductionTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mutable-config.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.getEmail());
        ((Mutable)user).setReadonly(true);
        System.out.println(((Mutable)user).getReadonly());
        user.setEmail("new-email@qq.com");
        System.out.println(user.getEmail());
    }
}
