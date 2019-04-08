package cn.goods.entity;

//商品分类食品类
public class GoodsSort {
    private long id;//分类编号
    private String name;//分类名称

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
