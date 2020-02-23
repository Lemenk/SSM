package top.lemenk.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.jdbctemplate
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/11 20:29
 * @Description: JdbcTemplate的最基本用法
 */
public class JdbcTemplateDemo2 {

    public static void main(String[] args) {

        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        JdbcTemplate jt = ac.getBean("jdbcTemplate",JdbcTemplate.class);
        //3.执行操作
        jt.execute("insert into account(name,money)value('eee',3000)");
        /*//准备数据源：spring内置数据库
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC");
        ds.setUsername("root");
        ds.setPassword("123456");

        //1.创建JdbcTemplate对象
        JdbcTemplate jt = new JdbcTemplate();
        //2.给JdbcTemplate对象设置数据源
        jt.setDataSource(ds);
        //3.执行操作
        jt.execute("insert into account(name,money)value('ddd',2000)");*/
    }
}
