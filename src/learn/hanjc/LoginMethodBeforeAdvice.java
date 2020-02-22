package learn.hanjc;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class LoginMethodBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("[LoginMethodBeforeAdvice] User " + objects[0] +
                " try to login...");
    }
}
