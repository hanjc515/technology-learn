package learn.hanjc;

public interface UserService {
    void create(String userName, String password);
    void login(String userName, String password);
}
