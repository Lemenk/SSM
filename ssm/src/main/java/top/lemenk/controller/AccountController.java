package top.lemenk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.lemenk.domain.Account;
import top.lemenk.service.IAccountService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.controller
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/25 19:43
 * @Description: web控制器层
 */

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService iAccountService;

    /**
     *
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层，查询所有账户");
        //调用service的方法
        List<Account> list = iAccountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response){
        System.out.println("表现层，保存账户");
        //调用service的方法
        iAccountService.saveAccount(account);
        try {
            response.sendRedirect(request.getContextPath()+"/account/findAll");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ;
    }
}
