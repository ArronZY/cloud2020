package com.lean.springcloud.service.impl;

import com.lean.springcloud.dao.PaymentDao;
import com.lean.springcloud.entities.Payment;
import com.lean.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: ArronZY
 * @Date: 2020/12/4 17:05
 */
@Service
public class PaymentServiceImpl implements PaymentService{
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

    public List<Payment> getAllPayment(){
        return paymentDao.getAllPayment();
    }
}
