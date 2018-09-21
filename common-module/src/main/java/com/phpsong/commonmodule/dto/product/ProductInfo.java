package com.phpsong.commonmodule.dto.product;

import lombok.Data;

import java.util.Date;

@Data
public class ProductInfo {
    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : tid
     */
    private String tid;

    /**
     * 对外展示名称
     * 表 : tb_prd_info
     * 对应字段 : label_name
     */
    private String labelName;

    /**
     * 短描述
     * 表 : tb_prd_info
     * 对应字段 : short_desc
     */
    private String shortDesc;

    /**
     * 库存
     * 表 : tb_prd_info
     * 对应字段 : price
     */
    private String price;

    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : store
     */
    private Integer store;

    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : create_by
     */
    private String createBy;

    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : create_date
     */
    private Date createDate;

    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : update_by
     */
    private String updateBy;

    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : update_date
     */
    private Date updateDate;

    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : remark
     */
    private String remark;

    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : version
     */
    private Integer version;

    /**
     * 
     * 表 : tb_prd_info
     * 对应字段 : state
     */
    private Integer state;


}