package com.lean.springcloud.controller;

import com.lean.springcloud.service.PaymentServcie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: ArronZY
 * @Date: 2020/12/28 20:09
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentServcie paymentServcie;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/patment/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        String result = paymentServcie.paymentInfo_ok(id);
        log.info("*******result:"+result);
        return result;
    }

    @GetMapping("/patment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String result = paymentServcie.paymentInfo_TimeOut(id);
        log.info("*******result:"+result);
        return result;
    }
}
