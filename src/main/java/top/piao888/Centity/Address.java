package top.piao888.Centity;

import javax.persistence.Embeddable;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Address.java
 * @Description 嵌入类，不会被映射为一张表
 * @createTime 2019年01月31日 14:28:00
 */
@Embeddable /*b表示一个嵌入类,这个类的对象在另一个实体类中充当属性*/
public class Address {
    private String postCode;//邮编
    private String address;;//地址
    private String phone;//联系电话

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
