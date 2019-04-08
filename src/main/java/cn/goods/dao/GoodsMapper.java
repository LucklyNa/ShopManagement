package cn.goods.dao;

import cn.goods.entity.GoodsDetail;
import cn.goods.entity.GoodsSort;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface  GoodsMapper {

    //查询所有的商品信息
     List<GoodsSort> queryAllGoodsSort();

     //按分页编号查询表中的总计录数
     Integer queryGoodsDetailCount(@Param("sortId") long sortId);

     //按分页的编号查询分页列表信息
     List<GoodsDetail> queryGoodsDetailPageList(@Param("sortId") long sortId,@Param("strartPage") Integer strartPage,@Param("pageSize") Integer pageSize);
}
