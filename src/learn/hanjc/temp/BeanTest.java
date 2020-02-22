package learn.hanjc.temp;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanTest {
    public static void main(String[] args) {

        //用ApplicationContext创建spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-learn-config.xml");
        Person person = ctx.getBean("chinese", Person.class);
        person.useAxe();

        StoneAxe axe = ctx.getBean("stoneAxe", StoneAxe.class);
        System.out.println(axe.chop());

        //用BeanFactory创建spring容器
        Resource resource = new ClassPathResource("spring-learn-config.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        new XmlBeanDefinitionReader(factory).loadBeanDefinitions(resource);
    }
}
