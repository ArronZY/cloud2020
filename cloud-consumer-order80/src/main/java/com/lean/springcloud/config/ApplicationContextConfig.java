package com.lean.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: ArronZY
 * @Date: 2020/12/7 11:56
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced // 标注此注解后，RestTemplate就具有了客户端负载均衡能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
