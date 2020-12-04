package com.lean.springcloud.service;

import com.lean.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: ArronZY
 * @Date: 2020/12/4 17:05
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
