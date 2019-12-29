package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

import java.util.List;

/**
 * @Auther: 宋金城
 * @Date: 2019/12/28 20:15
 * @Description:
 */
public interface PaymentService {
    public void create(Payment payment);

    public void delete(Long id);

    public void update(Payment payment);

    public Payment getPaymentById(Long id);

    public List<Payment> list();
}
