package top.piao888.Pentity;


import javax.persistence.*;
import java.util.Date;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Students.java
 * @Description 属性级别注解
 * @createTime 2019年01月29日 11:33:00
 */
/*学生实体类*/
    @Entity
public class Students {
    @Id  //只能保证他是主键 不能保证他会自动增长，若想要他自动增长  需要设置 @GeneratedValue 注解
    @GeneratedValue(strategy = GenerationType.AUTO)// 默认主键生成策略
    private int sid;  //学号
//    @Id //主键属性  （可以拥有多个主键）
//    @Column(length = 8)  //字段属性
    private String saname;  //姓名
    private String gender;  //性别
    private Date birthda;  //出生日期
    private String major;  //专业
    private Address address;  //地址

    public Students(){

    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSaname() {
        return saname;
    }

    public void setSaname(String saname) {
        this.saname = saname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthda() {
        return birthda;
    }

    public void setBirthda(Date birthda) {
        this.birthda = birthda;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
