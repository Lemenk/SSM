package top.lemenk.utils;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.utils
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/8 9:05
 * @Description: 记录日志的工具类，提供了公共代码
 */
public class Logger {

    //用于打印日治，计划让其在切入点方法执行之前执行（切入点方法就是业务层方法）
    public void printLog(){
        System.out.println("Logger类中的printLog方法开始记录日志。。。");
    }
}
