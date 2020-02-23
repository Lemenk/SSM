package top.lemenk.service.impl;


import top.lemenk.dao.IAccountDao;
import top.lemenk.dao.impl.AccountDaoImpl;
import top.lemenk.service.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = new AccountDaoImpl();

    public void  saveAccount(){
        accountDao.saveAccount();
    }
}
