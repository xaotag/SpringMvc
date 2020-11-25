import Service.Impl.UserServiceImpl;
import Service.UserService;
import dao.Imlp.MysqlDaoImpl;
import dao.Imlp.OracleDaoImpl;

public class Test {
    @org.junit.Test
    public void main() {
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new OracleDaoImpl());
        userService.userData();
    }

}
