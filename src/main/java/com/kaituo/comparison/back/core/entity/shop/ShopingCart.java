package com.kaituo.comparison.back.core.entity.shop;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Mybatis Generator 2019/08/21
 */
@ApiModel(value = "com.kaituo.comparison.back.core.entity.shop.ShopingCart")
@Data
@TableName(value = "shoping_cart")
public class ShopingCart implements Serializable {
    /**
     * 购物id
     */
    @TableField(value = "id")
    @ApiModelProperty(value = "购物id")
    private String id;

    /**
     * 商品名称
     */
    @TableField(value = "shop_name")
    @ApiModelProperty(value = "商品名称")
    private String shopName;

    /**
     * 创建时间
     */
    @TableField(value = "create_date", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    /**
     * 创建人
     */
    @TableField(value = "creator", fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建人")
    private String creator;

    /**
     * 更新时间
     */
    @TableField(value = "update_date", fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "更新时间")
    private Date updateDate;

    /**
     * 更新人
     */
    @TableField(value = "updater", fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "更新人")
    private String updater;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_SHOP_NAME = "shop_name";

    public static final String COL_CREATE = "create";

    public static final String COL_CREATOR = "creator";

    public static final String COL_UPDATE = "update";

    public static final String COL_UPDATER = "updater";

    public ShopingCart() {
    }

    protected boolean canEqual(Object other) {
        return other instanceof ShopingCart;
    }
}