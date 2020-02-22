package learn.hanjc.basicadvisor;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class CreateAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("[CreateAfterReturningAdvice] new user created: " + args[0]);
    }
}
