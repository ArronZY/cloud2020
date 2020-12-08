package com.lean.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: ArronZY
 * @Date: 2020/12/7 14:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String  message;
    private T   data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
