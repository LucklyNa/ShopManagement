package cn.goods.service.Impl;

import cn.goods.dao.GoodsMapper;
import cn.goods.entity.GoodsDetail;
import cn.goods.entity.GoodsSort;
import cn.goods.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public List<GoodsSort> queryAllGoodsSort() {
        return goodsMapper.queryAllGoodsSort();
    }

    @Override
    public Integer queryGoodsDetailCount(long sortId) {
        return goodsMapper.queryGoodsDetailCount(sortId);
    }

    @Override
    public List<GoodsDetail> queryGoodsDetailPageList(long sortId, Integer strartPage, Integer pageSize) {
        return goodsMapper.queryGoodsDetailPageList(sortId,strartPage,pageSize);
    }
}
