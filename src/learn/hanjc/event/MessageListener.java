package learn.hanjc.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MessageListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println(applicationEvent.toString());
    }
}
