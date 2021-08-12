package com.denghuolanshan.accountmanagementsystem.purchase.controller;


import com.denghuolanshan.accountmanagementsystem.purchase.entity.Purchase;
import com.denghuolanshan.accountmanagementsystem.purchase.service.PurchaseService;
import com.denghuolanshan.accountmanagementsystem.purchase.service.impl.PurchaseServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
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
        return new ObjectMapper().writeValueAsString(purchaseServiceImpl.getAllPurchase());
    }
//    @Test
//    public void littleTest() throws JsonProcessingException {
//        System.out.println(purchaseServiceImpl.getAllPurchase().toString());
//        System.out.println(new ObjectMapper().writeValueAsString(purchaseServiceImpl.getAllPurchase()));
//    }

    @GetMapping("/add")
    public void Insert(){
        purchaseServiceImpl.insert();
    }
}
