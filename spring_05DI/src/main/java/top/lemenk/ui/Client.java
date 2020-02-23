package top.lemenk.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.lemenk.service.IAccountService;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {

    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
        //构造函数注入
//        IAccountService as  = (IAccountService)ac.getBean("accountService");
//        as.saveAccount();
        //set方法注入
//        IAccountService as2  = (IAccountService)ac.getBean("accountService2");
//        as2.saveAccount();
        //复杂类型的注入
        IAccountService as3  = (IAccountService)ac.getBean("accountService3");
        as3.saveAccount();
    }
}
