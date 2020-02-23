package top.lemenk.domain;

import java.io.Serializable;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.domain
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/11 19:52
 * @Description: 账户实体类
 */
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
