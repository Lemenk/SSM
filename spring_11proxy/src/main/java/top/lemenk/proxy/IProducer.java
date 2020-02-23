package top.lemenk.proxy;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.proxy
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/7 13:35
 * @Description: 对厂家要求的接口
 */
public interface IProducer {
    //销售
    public void saleProduct(float money);

    //售后
    public void afterService(float money);
}
