package top.lemenk.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.controller
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/24 9:24
 * @Description: 控制器类
 */

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * SpringMVC方式上传文件
     * @param request
     * @return
     */
    @RequestMapping("/fileUpload2")
    public String fileUpload2(HttpServletRequest request, MultipartFile upload){
        System.out.println("springmvc文件上传开始...");
        //使用upload组件完成文件上传
        //上传位置
        String path = request.getSession().getServletContext().getRealPath("/upload/");
        //获取文件上传路径
        System.out.println(path);
        //判断路径是否存在
        File file = new File(path);
        if (!file.exists()) {
            //创建文件夹
            file.mkdirs();
        }
        //说明是上传文件项
        // 获取上传文件的名称
        String filename = upload.getOriginalFilename();
        //修改文件名称
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + "_" + filename;
        //完成文件上传
        try {
            upload.transferTo(new File(path,filename));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("文件上传"+filename+"成功...");
        return "success";
    }

    /**
     * 传统方式文件上传
     * @param request
     * @return
     */
    @RequestMapping("/fileUpload1")
    public String fileUpload1(HttpServletRequest request){
        System.out.println("文件上传开始...");
        //使用upload组件完成文件上传
        //上传位置
        String path = request.getSession().getServletContext().getRealPath("/upload");
        //获取文件上传路径
        System.out.println(path);
        //判断路径是否存在
        File file = new File(path);
        if (!file.exists()) {
            //创建文件夹
            file.mkdirs();
        }
        //解析request对象，获取上传文件项
        DiskFileItemFactory factory  = new DiskFileItemFactory();
        //factory.setRepository(file);
        ServletFileUpload fileUpload = new ServletFileUpload(factory);
        //解析request
        try {
            List<FileItem> items = fileUpload.parseRequest(request);
            for (FileItem item:items) {
                //进行判断房前item对象是否是上传文件项
                if (item.isFormField()){

                }else{
                    //说明是上传文件项
                    //获取上传文件的名称
                    String filename = item.getName();
                    //修改文件名称
                    String uuid = UUID.randomUUID().toString().replace("-", "");
                    filename = uuid + "_" + filename;
                    //完成文件上传
                    item.write(new File(path,filename));
                    //删除临时文件
                    item.delete();
                    System.out.println("文件上传"+filename+"成功...");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }
}
