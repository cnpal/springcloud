package com.pal.springcloud.controller;

import com.pal.springcloud.domain.CommonResult;
import com.pal.springcloud.domain.Order;
import com.pal.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author pal
 * @Date Created in 2020/7/8 14:28
 * @Version: 1.0
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }

}
