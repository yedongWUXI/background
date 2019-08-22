package com.kaituo.comparison.back.core.controller.shop;

import com.kaituo.comparison.back.common.bean.ResponseCode;
import com.kaituo.comparison.back.common.bean.ResponseResult;
import com.kaituo.comparison.back.core.entity.shop.ShopingCart;
import com.kaituo.comparison.back.core.service.shop.ShopingCartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author: yedong
 * @Date: 2019/8/21 14:43
 * @Modified by:
 */
@RestController
@RequestMapping(value = {"/shop"})
@Api(tags = {"购物相关"})
public class ShopController {
    @Autowired
    ShopingCartService shopingCartService;

    @GetMapping("/all")
    @ApiOperation("查询")
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token")
    public ResponseResult getList() {

        return ResponseResult.e(ResponseCode.OK, shopingCartService.list());
    }

    @PostMapping("/save")
    @ApiOperation("添加购物车")
    @ApiImplicitParam(paramType = "header", name = "Authorization", value = "身份认证Token")
    public ResponseResult save(@RequestBody ShopingCart shopingCart) {

        shopingCartService.save(shopingCart);
        return ResponseResult.e(ResponseCode.OK);
    }

}
