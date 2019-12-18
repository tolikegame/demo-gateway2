package com.example.gateway.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Bean
    public IRule iRule() {
//        return new RandomRule();    //隨機選server
        return new RoundRobinRule();    //按順序選server
    }
}
