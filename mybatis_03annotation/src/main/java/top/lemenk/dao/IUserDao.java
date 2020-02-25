package top.lemenk.dao;

import org.apache.ibatis.annotations.Select;
import top.lemenk.domain.User;

import java.util.List;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.dao
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/25 18:32
 * @Description: 持久层接口
 */
public interface IUserDao {

    @Select("select * from user")
    List<User> findAll();
}
