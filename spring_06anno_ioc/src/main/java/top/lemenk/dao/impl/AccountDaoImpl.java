package top.lemenk.dao.impl;

import org.springframework.stereotype.Repository;
import top.lemenk.dao.IAccountDao;

/**
 * 账户的持久层实现类
 */
@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

    public  void saveAccount(){

        System.out.println("保存了账户");
    }
}
