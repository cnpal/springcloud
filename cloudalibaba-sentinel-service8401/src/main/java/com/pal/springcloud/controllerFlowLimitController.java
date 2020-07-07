package com.pal.springcloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author pal
 * @Date Created in 2020/7/6 13:49
 * @Version: 1.0
 */
@RestController
public class controllerFlowLimitController {
    @GetMapping("/testA")
    public String  testA(){
        return "---testA";
    }
    @GetMapping("/testB")
    public String  testB(){
        return "---testB";
    }
}
