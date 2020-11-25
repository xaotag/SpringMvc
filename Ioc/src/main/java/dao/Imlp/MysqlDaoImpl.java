package dao.Imlp;

import dao.UserDao;

/**
 * @author aiden
 *
 */
public class MysqlDaoImpl implements UserDao {
    @Override
    public void userData() {
        System.out.println("从Mysql获取数据");
    }
}
