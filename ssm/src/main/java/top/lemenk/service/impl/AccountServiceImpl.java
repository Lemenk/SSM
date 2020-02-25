package top.lemenk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lemenk.dao.IAccountDao;
import top.lemenk.domain.Account;
import top.lemenk.service.IAccountService;

import java.util.List;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.service.impl
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/25 19:41
 * @Description: 业务逻辑层实现类
 */

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao iAccountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询所有账户");
        return iAccountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户");
        iAccountDao.saveAccount(account);
    }
}
