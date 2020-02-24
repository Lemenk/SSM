package top.lemenk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.lemenk.exception.SystemException;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.controller
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/24 12:49
 * @Description: 控制器类
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testException")
    public String testException() throws SystemException {
        System.out.println("testException执行了。。。");
        try {
            //模拟异常
            int a = 10/0;
        } catch (Exception e) {
            e.printStackTrace();
            //抛出自定义异常信息
            throw new SystemException("查询出现异常");
        }
        return "success";

    }
}
