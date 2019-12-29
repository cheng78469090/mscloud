package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Auther: 宋金城
 * @Date: 2019/12/28 20:23
 * @Description:
 */
@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        System.out.println(payment);
        System.out.println("调用成功");
        System.out.println("我是8002");
        paymentService.create(payment);
        return new CommonResult(200,"你做到了",payment);
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getId(@PathVariable Long id){
        Payment payment = paymentService.getPaymentById(id);
        System.out.println("信息"+payment);
        System.out.println("我是8002");
        return new CommonResult<>(payment);
    }



}
