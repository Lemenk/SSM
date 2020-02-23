package top.lemenk.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: top.lemenk.domain
 * @Author: Lemenk
 * @Blog: www.lemenk.top
 * @Date: Created in 2020/2/14 11:25
 * @Description: 用户信息
 */
public class User implements Serializable {

    private String uname;
    private Integer age;

    //添加日期属性，验证自定义类型转换器
    private Date date;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    /*@Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                '}';
    }*/

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
