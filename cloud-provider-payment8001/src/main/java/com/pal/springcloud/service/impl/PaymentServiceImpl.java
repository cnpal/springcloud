package com.pal.springcloud.service.impl;

import com.pal.springcloud.dao.PaymentDao;
import com.pal.springcloud.entities.Payment;
import com.pal.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author pal
 * @Date Created in 2020/3/24 15:12
 * @Version: 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
