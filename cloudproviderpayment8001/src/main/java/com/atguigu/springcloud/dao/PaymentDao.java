package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: 宋金城
 * @Date: 2019/12/28 20:07
 * @Description:
 */
@Mapper
public interface PaymentDao {
    public void create(Payment payment);

    public Payment getPaymentById(Long id);
}
