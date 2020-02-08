package learn.hanjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-learn-config.xml");
        Person person = ctx.getBean("chinese", Person.class);
        person.useAxe();

        StoneAxe axe = ctx.getBean("stoneAxe", StoneAxe.class);
        System.out.println(axe.chop());
    }
}
