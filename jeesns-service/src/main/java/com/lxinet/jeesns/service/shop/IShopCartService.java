package com.lxinet.jeesns.service.shop;


import com.lxinet.jeesns.core.service.IBaseService;
import com.lxinet.jeesns.model.shop.GoodsCate;
import com.lxinet.jeesns.model.shop.ShopCart;

import java.util.List;


/**
 * 购物车
 * Created by zchuanzhao on 2019/5/27.
 */
public interface IShopCartService extends IBaseService<ShopCart> {

    List<ShopCart> listByMemberId(Integer memberId);

    Boolean updateNum(Integer id, Integer num, Integer memberId);

    Boolean delete(Integer id, Integer memberId);

    Boolean deleteByMemberId(Integer memberId);
}
