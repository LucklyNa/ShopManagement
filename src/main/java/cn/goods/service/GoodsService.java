package cn.goods.service;

import cn.goods.entity.GoodsDetail;
import cn.goods.entity.GoodsSort;

import java.util.List;

public interface GoodsService {

    //查询所有的商品信息
    List<GoodsSort> queryAllGoodsSort();

    //按分页编号查询表中的总计录数
    Integer queryGoodsDetailCount(long sortId);

    //按分页的编号查询分页列表信息
    List<GoodsDetail> queryGoodsDetailPageList(long sortId, Integer strartPage, Integer pageSize);
}
