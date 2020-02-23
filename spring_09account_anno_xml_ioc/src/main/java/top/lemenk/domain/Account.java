package top.lemenk.domain;

import java.io.Serializable;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.domain
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date:Created in 2020/2/5 12:40
 * @Description: 账户的实体类
 */

/*
* Serializable:一个对象序列化的接口，一个类只有实现了Serializable接口，它的对象才能被序列化。
* 序列化是将对象状态转换为可保持或传输的格式的过程。
* 为什么要序列化对象?
*       1.把对象转换为字节序列的过程称为对象的序列化
        2.把字节序列恢复为对象的过程称为对象的反序列化
* 什么情况下需要序列化？
*   当我们需要把对象的状态信息通过网络进行传输，或者需要将对象的状态信息持久化，以便将来使用时都需要把对象进行序列化。
*
* 实际上Serializable里并没有实质性的内容，只是告诉jvm让它序列化这个类。
* */
public class Account implements Serializable {

    private Integer id;
    private String name;
    private Float money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
