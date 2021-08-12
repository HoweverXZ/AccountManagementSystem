package com.denghuolanshan.accountmanagementsystem.purchase.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

/**
 * <p>
 * 
 * </p>
 *
 * @author xzt
 * @since 2021-08-09
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Purchase implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Integer serialnumber;

    /**
     * 购买时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:dd")
    private Date purchasetime;

    /**
     * 型号规格
     */
    @TableField("Modelspecification")
    private String modelspecification;

    /**
     * 消费者
     */
    private String consumer;

    /**
     * 联系方式(电话号)
     */
    @TableId(value = "contact", type = IdType.INPUT)
    private String contact;

    /**
     * 产品价格
     */
    private BigDecimal productprice;

    /**
     * 付款金额
     */
    @TableField("Paymentamount")
    private BigDecimal paymentamount;

    /**
     * 是否付定金
     */
    private Boolean deposit;

    /**
     * 欠款
     */
    @TableField("Arrears")
    private BigDecimal arrears;

    /**
     * 备注
     */
    private String tips;

    public Purchase(String modelspecification, String consumer, String contact, BigDecimal productprice, BigDecimal paymentamount, Boolean deposit,  String tips) {
        this.modelspecification = modelspecification;
        this.consumer = consumer;
        this.contact = contact;
        this.productprice = productprice;
        this.paymentamount = paymentamount;
        this.deposit = deposit;
        this.arrears = productprice.subtract(paymentamount);
        this.tips = tips;
    }
}
