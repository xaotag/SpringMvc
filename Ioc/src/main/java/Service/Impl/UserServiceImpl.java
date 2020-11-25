package Service.Impl;

import Service.UserService;
import dao.Imlp.MysqlDaoImpl;
import dao.UserDao;

/**
 * @author aiden
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    //private UserDao userDao  = new MysqlDaoImpl(); 废弃方法
    /**
     * 使用Set 动态注入值
     * @param userDao
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void userData() {
        userDao.userData();
    }
}
