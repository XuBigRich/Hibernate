package top.piao888.Centity;

import javax.persistence.Entity;  /*JPA注解*/
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Students.java
 * @Description 类级别注解
 * @createTime 2019年01月29日 11:33:00
 */
/*学生实体类*/
    @Entity
    @Table(name="t_students",schema="hibernate")
public class Students {
    private int sid;  //学号
    private String saname;  //姓名
    private String gender;  //性别
    private Date birthda;  //出生日期
    private String major;  //专业
    private Address address;  //地址

    public Students(){

    }
@Id
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
