package top.lemenk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import top.lemenk.domain.User;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.controller
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/20 14:48
 * @Description: 控制器类
 */

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 返回值类型为String
     * @param model
     * @return
     */
    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString方法执行了");
        //模拟从数据库中查询出user对象
        User user = new User();
        user.setUsername("美美");
        user.setPassword("123");
        user.setAge(30);
        //model对象
        model.addAttribute("user",user);
        return "success";
    }

    /**
     * 返回值类型为void
     * 默认会寻找/WEB-INF/pages/目录下的/user/testVoid.jsp
     * @param model
     */
    @RequestMapping("/testVoid")
    public void testVoid(Model model){
        System.out.println("testVoid方法执行了");

    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(Model model){
        //创建对象
        ModelAndView mav = new ModelAndView();
        System.out.println("testModelAndView方法执行了");
        //模拟从数据库中查询出user对象
        User user = new User();
        user.setUsername("小红");
        user.setPassword("456");
        user.setAge(18);

        //把user对象存储到mav对象中
        mav.addObject("user",user);

        //指定跳转的页面
        mav.setViewName("success");

        return mav;
    }

    /**
     * 模拟异步请求响应
     */
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("testAjax方法执行了");
        //客户端发送ajax请求，穿的是json字符串，后端把json字符串封装到user对象中
        System.out.println(user);
        //模拟查询数据库，响应
        user.setUsername("哈哈");
        user.setPassword("456");
        user.setAge(18);
        return user;
    }
}
