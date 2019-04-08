package cn.goods.controller;

import cn.goods.entity.GoodsDetail;
import cn.goods.entity.GoodsSort;
import cn.goods.entity.Page;
import cn.goods.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller("goods")
@RequestMapping("/goods")
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    @RequestMapping("/list")
    public String goodsList(@RequestParam(required = false,defaultValue = "0") long sortId, @RequestParam Integer currentPageNo, Model model){
        //查询所有的商品分类
        List<GoodsSort> sortList=goodsService.queryAllGoodsSort();
        Integer totalCount=goodsService.queryGoodsDetailCount(sortId);
        Page page = new Page();
        currentPageNo = currentPageNo == null ? 1 : currentPageNo;
        page.setCurrentPageNo(currentPageNo);
        page.setPageSize(3);
        page.setTotalCount(totalCount);
       Integer strartPage = (page.getCurrentPageNo()-1)*page.getPageSize();
        List<GoodsDetail> goodsDetails=goodsService.queryGoodsDetailPageList(sortId,strartPage,page.getPageSize());
        model.addAttribute("sortList",sortList);
        model.addAttribute("page",page);
        model.addAttribute("goodsDetails",goodsDetails);
        return "goodsList";
    }

   //新增
    public String aa(){
        return "";
    }
}
