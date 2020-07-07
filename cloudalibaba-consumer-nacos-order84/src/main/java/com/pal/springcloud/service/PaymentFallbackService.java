package com.pal.springcloud.service;

import com.pal.springcloud.entities.CommonResult;
import com.pal.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author pal
 * @Date Created in 2020/7/7 18:50
 * @Version: 1.0
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(long id) {
        return new CommonResult<>(444, "服务降级返回，---PaymentFallbackService", new Payment(id, "ErrorSerial"));
    }
}
