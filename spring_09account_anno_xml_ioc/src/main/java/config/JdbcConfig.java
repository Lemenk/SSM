package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: config
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date:Created in 2020/2/6 19:57
 * @Description: 和spring连接数据库相关的配置类
 */
public class JdbcConfig {

    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;



    //用于创建一个QueryRunner对象
    @Bean(name = "runner")
    @Scope("prototype")
    public QueryRunner createQueryRunner(DataSource dataSource){
        return new QueryRunner(dataSource);
    }

    @Bean(name = "dataSource")
    //创建数据源对象
    public DataSource createDataSource(){
        try{
            ComboPooledDataSource cpds = new ComboPooledDataSource();
            cpds.setDriverClass(driver);
            cpds.setJdbcUrl(url);
            cpds.setUser(username);
            cpds.setPassword(password);
            return cpds;
        }catch (Exception e){
            throw new RuntimeException(e);
        }


    }
}
