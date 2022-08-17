package com.test.swagger;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品服务
 */
@Service // 注册为服务类
public class GoodsService {
    /**
     * 获取商品列表
     */
    public List<GoodsDo> getGoodsList() {
        List<GoodsDo> goodsList = new ArrayList<GoodsDo>();
        GoodsDo goods = new GoodsDo();
        goods.setId(1L);
        goods.setName("苹果");
        goods.setPic("apple.jpg");
        goods.setPrice("3.5");
        goodsList.add(goods);
        return goodsList;
    }
    /**
     * 按id获取商品信息，模拟返回对应商品信息
     */
    public GoodsDo getGoodsById(Long id) {
        GoodsDo goods = new GoodsDo();
        goods.setId(1L);
        goods.setName("苹果");
        goods.setPic("apple.jpg");
        goods.setPrice("3.5");
        return goods;
    }
}

