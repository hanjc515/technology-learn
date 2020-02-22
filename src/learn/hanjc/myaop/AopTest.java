package learn.hanjc.myaop;

import learn.hanjc.UserDao;
import learn.hanjc.UserService;
import learn.hanjc.UserServiceImpl;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class AopTest {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        UserServiceImpl target = new UserServiceImpl();
        target.setUserDao(userDao);

        MethodBeforeAdvice log = new MethodBeforeAdvice() {
            @Override
            public void before(Method method, Object[] objects, Object o) throws Throwable {
                System.out.println("call method:" + method.getName());
            }
        };

        UserService userService = (UserService) AopProxyFactory.createProxy(target, log);
        userService.create("aop", "mypassword");
        userService.login("aop", "mypassword");
        userDao.print();
    }
}
