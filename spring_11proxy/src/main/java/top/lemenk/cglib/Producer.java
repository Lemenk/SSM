package top.lemenk.cglib;

import top.lemenk.proxy.IProducer;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.proxy
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/7 13:31
 * @Description: 生产者
 */
public class Producer{

    //销售
    public void saleProduct(float money){
        System.out.println("销售产品，并得到钱"+money);
    }

    //售后
    public void afterService(float money){
        System.out.println("提供售后服务，并拿到钱"+money);
    }
}
