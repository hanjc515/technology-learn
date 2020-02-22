package learn.hanjc.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MessagePublisher implements ApplicationContextAware, ApplicationListener {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if(applicationEvent.getSource() == this) {
            System.out.println("my own msg: " + applicationEvent.toString());
        }
    }

    public void sendMessage(final String msg) {
        applicationContext.publishEvent(
                new ApplicationEvent(this) {
                    @Override
                    public String toString() {
                        return msg;
                    }
                }
        );
    }
}
