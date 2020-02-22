package learn.hanjc.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-learn-config.xml");
        MessagePublisher publisher = (MessagePublisher) context.getBean("messagePublisher");

        publisher.sendMessage("Hello World!");
    }
}
