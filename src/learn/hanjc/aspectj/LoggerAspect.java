package learn.hanjc.aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAspect {

    @Before("execution(* learn.hanjc.UserService.login(..))")
    public void logBefore() {
        System.out.println("[logger] User try to login...");
    }

    @AfterReturning("execution(* learn.hanjc.UserService.login(..)) && args(username,..)")
    public void logSuccess(String username) {
        System.out.println("[Logger] User " + username + "login successfully!");
    }

    @AfterThrowing(pointcut = "execution(* learn.hanjc.UserService.login(..))", throwing = "e")
    public void logFailure(RuntimeException e) {
        System.out.println("[Logger] Exception:" + e.getMessage());
    }
}
