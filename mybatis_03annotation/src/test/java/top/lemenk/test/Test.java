package top.lemenk.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import top.lemenk.dao.IUserDao;
import top.lemenk.domain.User;

import java.io.InputStream;
import java.util.List;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.Test
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/25 18:44
 * @Description: 测试类
 */
public class Test {

    public static void main(String[] args) throws  Exception{
        //1.获取字节输入流
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.根据字节输入流构建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.根据SqlSessionFactory生产一个SqlSession
        SqlSession session = factory.openSession();
        //4.使用SqlSession获取Dao的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        //5.执行Dao的方法
        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
        }
        //6.释放资源
        session.close();
        in.close();
    }
}
