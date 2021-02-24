package com.lean.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author: ArronZY
 * @Date: 2020/12/28 20:01
 */
@Service
public class PaymentServcie {
    /**
     * 正常访问，肯定ok
     * @param id
     * @return
     */
    public String paymentInfo_ok(Integer id){
        return "线程池："+Thread.currentThread().getName()+" paymentInfo_ok,id："+id+"\t"+"O(∩_∩)O哈哈~";
    }

    public  String paymentInfo_TimeOut(Integer id){
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        }catch (InterruptedException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        return "线程池："+Thread.currentThread().getName()+" paymentInfo_TimeOut,id："+id+"\t"+"O(∩_∩)O哈哈~"+"耗时(秒)："+timeNumber;
    }
}
