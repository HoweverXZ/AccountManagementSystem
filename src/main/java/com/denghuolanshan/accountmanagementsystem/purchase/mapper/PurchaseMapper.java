package com.denghuolanshan.accountmanagementsystem.purchase.mapper;

import com.denghuolanshan.accountmanagementsystem.purchase.entity.Purchase;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xzt
 * @since 2021-08-09
 */
@Repository
@Mapper
public interface PurchaseMapper extends BaseMapper<Purchase> {
    @Select("select * from purchase")
    public List<Purchase> getAll();
}
