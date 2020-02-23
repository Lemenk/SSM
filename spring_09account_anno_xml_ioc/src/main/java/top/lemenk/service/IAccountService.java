package top.lemenk.service;

import top.lemenk.domain.Account;

import java.util.List;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.service
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date:Created in 2020/2/5 12:38
 * @Description: 账户的业务层接口
 */
public interface IAccountService {

    //查询所有
    List<Account> findAllAccount();

    //查询某一个
    Account findAccountById(Integer accountId);

    //保存
    void saveAccount(Account account);

    //更新
    void updateAccount(Account account);

    //删除
    void deleteAccount(Integer accountId);


}
