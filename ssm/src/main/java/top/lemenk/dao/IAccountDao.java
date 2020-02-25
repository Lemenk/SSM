package top.lemenk.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import top.lemenk.domain.Account;

import java.util.List;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.dao
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/25 19:37
 * @Description: 账户dao接口
 */
public interface IAccountDao {

    //查询所有账户
    @Select("select * from account")
    public List<Account> findAll();

    //保存账户
    @Insert("insert into account (name,money) value (#{name},#{money})")
    public void saveAccount(Account account);
}
