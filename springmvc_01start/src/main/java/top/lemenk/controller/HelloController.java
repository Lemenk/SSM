package top.lemenk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.controller
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/13 17:22
 * @Description: 控制器类 Controller
 */
@Controller
public class HelloController {

    /**
     * RequestMapping：用于建立请求URL和处理请求方法之间的对应关系
     * @return
     */
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello SpringMVC");
        return "success";
    }

    /**
     * RequestMapping注解
     *      1.可以放在类或者方法上，但需要改变路径
     *      2.属性：
     *          path/value：用于指定请求的URL
     *          method：用于指定请求的方式 GET/HEAD/POST/PUT/...  例如：method = {RequestMethod.GET}
     *          params：用于指定限制请求参数的条件，它支持简单的表达式。要求请求参数的key和value必须和配置的一模一样。
     *          header：用于指定必须包含的请求头
     * @return
     */
    @RequestMapping(path = "/testRequestMapping" )
    public String testRequestMapping(){
        System.out.println("测试RequestMapping注解...");
        return "success";
    }
}
