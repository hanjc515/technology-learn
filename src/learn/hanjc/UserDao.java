package learn.hanjc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserDao {
    private Map<String, String> map = new HashMap();
    public UserDao() {
        map.put("admin", "security");
        map.put("test", "123456");
    }

    public void create(String userName, String password) {
        if(map.get(userName) != null) {
            throw new RuntimeException("user exists!");
        }
        map.put(userName, password);
    }

    public void login(String userName, String password) {
        String pwd = map.get(userName);
        if(pwd == null || !pwd.equals(password)) {
            throw new RuntimeException("login failed");
        }
    }

    public void print() {
        System.out.println("user list:");
        Set<String> keySet = map.keySet();

        for(String key : keySet) {
            System.out.println(key);
        }
    }
}
