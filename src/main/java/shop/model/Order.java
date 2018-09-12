package shop.model;

import java.math.BigDecimal;

/**
 * @program: Shop
 * @Date: 2018/9/12 16:38
 * @Author: undefined
 * @Description:
 */
public class Order {

    private long id;
    private Product product;
    private String productName;
    private BigDecimal price;
    private Integer count;
    private Integer status;

    public long getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getCount() {
        return count;
    }

    public Integer getStatus() {
        return status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
