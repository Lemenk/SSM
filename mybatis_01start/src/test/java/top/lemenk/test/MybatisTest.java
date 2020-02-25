package top.lemenk.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import top.lemenk.dao.IUserDao;
import top.lemenk.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/25 15:31
 * @Description: 测试类
 */
public class MybatisTest {

    /**
     * 测试方法
     */
    @Test
    public void Test() {
        //1.读取配置文件(从类路径加载配置文件)
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream("SqlMapConfig.xml");
            //2.创建SqlSessionFactory工厂
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(in);
            //3.使用工厂生产SqlSession对象
            SqlSession session = factory.openSession();
            //4.使用SqlSession创建Dao接口的代理对象
            IUserDao userDao = session.getMapper(IUserDao.class);
            //5.使用代理对象执行方法
            List<User> users = userDao.findAll();
            for(User user : users){
                System.out.println(user);
            }
            //6.释放资源
            session.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
