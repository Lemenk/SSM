package top.lemenk.dao;

import top.lemenk.domain.User;

import java.util.List;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/25 13:51
 * @Description: 用户持久层接口
 */
public interface IUserDao {

    /**
     * 查询所有
     * @return
     */
    List<User> findAll();
}
