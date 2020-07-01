package com.pal.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author pal
 * @Date Created in 2020/3/24 14:23
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T  data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
