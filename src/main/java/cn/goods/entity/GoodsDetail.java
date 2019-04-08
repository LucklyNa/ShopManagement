package cn.goods.entity;

import java.math.BigDecimal;
import java.util.Date;

//商品明细实体类
public class GoodsDetail {
    private long id;//分类编号；
    private GoodsSort goodsSort;//商品明细对象,多对一
    /*private long sortId;//分类编号*/
    private String name;//商品名称
    private String address;//商品产地
    private BigDecimal price;//商品价格
    private Date cerateDate;//生产日期
    private int remaining;//剩余数量

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public GoodsSort getGoodsSort() {
        return goodsSort;
    }

    public void setGoodsSort(GoodsSort goodsSort) {
        this.goodsSort = goodsSort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getCerateDate() {
        return cerateDate;
    }

    public void setCerateDate(Date cerateDate) {
        this.cerateDate = cerateDate;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }


}
