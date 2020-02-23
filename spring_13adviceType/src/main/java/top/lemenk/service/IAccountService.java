package top.lemenk.service;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.service
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/7 20:18
 * @Description: 账户的业务层接口
 */
public interface IAccountService {
    //模拟保存账户
    void saveAccount();

    //模拟更新账户
    void updateAccount(int i);

    //模拟删除账户
    int deletAccount();

}
