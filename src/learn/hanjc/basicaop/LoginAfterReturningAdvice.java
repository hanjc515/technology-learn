package learn.hanjc.basicaop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LoginAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("[LoginAfterReturningAdvice] User " + objects[0] +
                " login successfully!");
    }
}
