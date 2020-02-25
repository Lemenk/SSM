package top.lemenk.service;

import top.lemenk.domain.Account;

import java.util.List;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.service
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/25 19:40
 * @Description: 业务逻辑层接口
 */
public interface IAccountService {

    //查询所有账户
    public List<Account> findAll();

    //保存账户
    public void saveAccount(Account account);
}
