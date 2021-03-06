package com.denghuolanshan.accountmanagementsystem.purchase.controller;


import com.denghuolanshan.accountmanagementsystem.purchase.entity.Purchase;
import com.denghuolanshan.accountmanagementsystem.purchase.service.impl.PurchaseServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author xzt
 * @since 2021-08-09
 */
@RestController
@CrossOrigin
//@SpringBootTest
public class PurchaseController {
    @Autowired
    PurchaseServiceImpl purchaseServiceImpl;

    @GetMapping("/purchase")
    public String getAll() throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(purchaseServiceImpl.list());
    }
//    @Test
//    public void littleTest() throws JsonProcessingException {
//        System.out.println(purchaseServiceImpl.getAllPurchase().toString());
//        System.out.println(new ObjectMapper().writeValueAsString(purchaseServiceImpl.getAllPurchase()));
//    }

    @PostMapping("/purchase")
    public void InsertController(@RequestParam(value = "modelspecification") String modelspecification,
                                 @RequestParam(value = "consumer") String consumer,
                                 @RequestParam(value = "contact") String contact,
                                 @RequestParam(value = "productprice") BigDecimal productprice,
                                 @RequestParam(value = "paymentamount") BigDecimal paymentamount,
                                 @RequestParam(value = "deposit") Boolean deposit,
                                 @RequestParam(value = "tips", required = false) String tips) {
        Purchase purchase = new Purchase(modelspecification, consumer, contact, productprice, paymentamount, deposit, tips);
        purchaseServiceImpl.save(purchase);
    }

    @DeleteMapping("/purchase")
    public void deleteController(@RequestParam(value = "contact") String contact) {
        purchaseServiceImpl.removeById(contact);
    }

    @PutMapping("/purchase")
    public void putController(@RequestParam(value = "modelspecification") String modelspecification,
                              @RequestParam(value = "consumer") String consumer,
                              @RequestParam(value = "contact") String contact,
                              @RequestParam(value = "productprice") BigDecimal productprice,
                              @RequestParam(value = "paymentamount") BigDecimal paymentamount,
                              @RequestParam(value = "deposit") Boolean deposit,
                              @RequestParam(value = "tips", required = false) String tips) {
        purchaseServiceImpl.updateById(new Purchase(modelspecification, consumer, contact, productprice, paymentamount, deposit, tips));
    }
}

