package com.denghuolanshan.accountmanagementsystem.purchase.service.impl;

import com.denghuolanshan.accountmanagementsystem.purchase.entity.Purchase;
import com.denghuolanshan.accountmanagementsystem.purchase.mapper.PurchaseMapper;
import com.denghuolanshan.accountmanagementsystem.purchase.service.PurchaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author xzt
 * @since 2021-08-09
 */
@Service
public class PurchaseServiceImpl extends ServiceImpl<PurchaseMapper, Purchase> implements PurchaseService {
    @Autowired
    private PurchaseMapper purchaseMapper;
    @Override
    public List<Purchase> getAllPurchase() {
        List<Purchase> all = purchaseMapper.getAll();
        return all;
    }

    @Override
    public void insert() {
        purchaseMapper.insert(new Purchase("60V50A","希芭plus","157xxxxxxxx", BigDecimal.valueOf(0.75),BigDecimal.valueOf(0.48),true,"欠款ING"));
    }
}
