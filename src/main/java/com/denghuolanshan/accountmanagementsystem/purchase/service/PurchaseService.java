package com.denghuolanshan.accountmanagementsystem.purchase.service;

import com.denghuolanshan.accountmanagementsystem.purchase.entity.Purchase;
import com.baomidou.mybatisplus.extension.service.IService;
import com.denghuolanshan.accountmanagementsystem.purchase.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xzt
 * @since 2021-08-09
 */
public interface PurchaseService extends IService<Purchase> {
    public List<Purchase> getAllPurchase();
    public void insert();
}
