package learn.hanjc.basicaop;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class LoginThrowsAdvice implements ThrowsAdvice {
    public void afterThrowing(Method m, Object[] args, Object target, Throwable subclass) {
        System.out.println("[LoginThrowsAdvice] An exception occur: " +
                subclass.getClass().getSimpleName());
    }
}
