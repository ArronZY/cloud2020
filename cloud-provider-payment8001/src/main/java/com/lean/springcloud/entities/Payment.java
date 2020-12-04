package com.lean.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: ArronZY
 * @Date: 2020/12/4 10:27
 */
@Data   //生成getter,setter等函数
@AllArgsConstructor //生成全参数构造函数
@NoArgsConstructor  //生成无参构造函数
public class Payment implements Serializable{
    private Long id;
    private String serial;
}
