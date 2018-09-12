package shop.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: Shop
 * @Date: 2018/9/12 16:37
 * @Author: undefined
 * @Description:
 */
public class Product {

    private long id;
    private String productName;
    private Integer count;
    private BigDecimal price;
    private String picture;
    private Date date;
    private Boolean isHave;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getHave() {
        return isHave;
    }

    public void setHave(Boolean have) {
        isHave = have;
    }
}
