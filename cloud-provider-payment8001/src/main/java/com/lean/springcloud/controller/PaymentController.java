package com.lean.springcloud.controller;

import com.lean.springcloud.entities.CommonResult;
import com.lean.springcloud.entities.Payment;
import com.lean.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: ArronZY
 * @Date: 2020/12/4 17:22
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("----插入结果"+result);

        if(result>0){
            return new CommonResult(200,"插入数据库成功",result);
        }else{
            return new CommonResult(444,"插入数据库失败",result);
        }

    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("----查询结果"+payment);

        if(payment!=null){
            return new CommonResult(200,"查询成功",payment);
        }else{
            return new CommonResult(444,"没有对应记录，查询ID："+id,null);
        }

    }

    @GetMapping(value = "/payment/getAll")
    public CommonResult getAllPayment(){
        List<Payment> payment = paymentService.getAllPayment();
        log.info("---查询结果"+payment);

        if(payment.size()>0){
            return new CommonResult(200,"查询成功",payment);
        }else{
            return new CommonResult(555,"没有查询记录，该列表未空",null);
        }
    }
}