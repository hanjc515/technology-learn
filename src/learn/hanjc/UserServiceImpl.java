package learn.hanjc;

public class UserServiceImpl implements UserService {
    UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void create(String userName, String password) {
        userDao.create(userName, password);
    }

    @Override
    public void login(String userName, String password) {
        userDao.login(userName, password);
    }
}
