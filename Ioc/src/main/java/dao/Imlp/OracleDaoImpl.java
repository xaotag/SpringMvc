package dao.Imlp;

import dao.UserDao;

/**
 * @author aiden
 *
 */
public class OracleDaoImpl implements UserDao {
    @Override
    public void userData() {
        System.out.println("从Oracle获取数据");
    }
}
