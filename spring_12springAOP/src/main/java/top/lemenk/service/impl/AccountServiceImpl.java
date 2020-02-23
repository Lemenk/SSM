package top.lemenk.service.impl;

import top.lemenk.service.IAccountService;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.service.impl
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/8 9:03
 * @Description: 业务层实现类
 */
public class AccountServiceImpl implements IAccountService {
    public void saveAccount() {
        System.out.println("执行了保存。。。");
    }

    public void updateAccount(int i) {
        System.out.println("执行了更新。。。");
    }

    public int deletAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}
