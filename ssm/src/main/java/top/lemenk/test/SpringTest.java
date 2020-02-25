package top.lemenk.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.lemenk.service.IAccountService;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.test
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/25 19:59
 * @Description: Spring测试类
 */
public class SpringTest {

    @Test
    public void run1(){
        //1.加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取对象
        IAccountService iAccountService = (IAccountService)applicationContext.getBean("accountService");
        //3.调用方法
        iAccountService.findAll();
    }
}
