package top.lemenk.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import top.lemenk.dao.IAccountDao;
import top.lemenk.domain.Account;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.test
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/25 20:55
 * @Description: Mybatis测试类
 */
public class MybatisTest {

    private InputStream inputStream;
    private IAccountDao iAccountDao;
    private SqlSession sqlSession;

    @Before
    public void init() {
        //加载mybatis配置文件
        try {
            inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建SqlSession对象
        sqlSession = sqlSessionFactory.openSession();
        //获取到代理对象
        iAccountDao = sqlSession.getMapper(IAccountDao.class);
    }

    @After
    public void destroy(){
        sqlSession.commit();
        sqlSession.close();
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void run1() {
        //指定方法，查询到所有数据
        List<Account> list = iAccountDao.findAll();
        for (Account account : list){
            System.out.println(account);
        }
    }

    @Test
    public void run2(){
        Account account = new Account();
        account.setName("小李");
        account.setMoney(1200D);
        iAccountDao.saveAccount(account);
        System.out.println("新建用户成功"+" "+account.getName());
    }
}
