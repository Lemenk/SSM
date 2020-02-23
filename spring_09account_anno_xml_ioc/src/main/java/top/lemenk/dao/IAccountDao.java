package top.lemenk.dao;

import top.lemenk.domain.Account;

import java.util.List;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.dao
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date:Created in 2020/2/5 12:55
 * @Description: 账户的持久层接口
 */
public interface IAccountDao {

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
