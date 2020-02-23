package top.lemenk.utils;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.utils
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/8 9:05
 * @Description: 记录日志的工具类，提供了公共代码
 */
public class Logger {

    /**
     * 前置通知
     */
    public void beforeprintLog(){
        System.out.println("前置通知Logger类中的beforeprintLog方法开始记录日志。。。");
    }

    /**
     * 后置通知
     */
    public void afterReturningprintLog(){
        System.out.println("后置通知Logger类中的afterReturningprintLog方法开始记录日志。。。");
    }

    /**
     * 异常通知
     */
    public void afterThrowingprintLog(){
        System.out.println("异常通知Logger类中的afterThrowingprintLog方法开始记录日志。。。");
    }

    /**
     * 最终通知
     */
    public void afterprintLog(){
        System.out.println("最终通知Logger类中的afterprintLog方法开始记录日志。。。");
    }

    /**
     * 环绕通知
     */
    public Object aroundPrintLog(ProceedingJoinPoint pjp){
        Object rtValue = null;
        try {
            Object[] args = pjp.getArgs();//得到方法执行所需的参数
            System.out.println("Logger类中的aroundPrintLog方法开始记录日志。。。前置");
            rtValue = pjp.proceed(args);//明确调用业务层方法（切入点方法）
            System.out.println("Logger类中的aroundPrintLog方法开始记录日志。。。后置");
            return rtValue;
        } catch (Throwable t) {
            System.out.println("Logger类中的aroundPrintLog方法开始记录日志。。。异常");
            throw new RuntimeException(t);
        }finally {
            System.out.println("Logger类中的aroundPrintLog方法开始记录日志。。。最终");
        }
    }

}
