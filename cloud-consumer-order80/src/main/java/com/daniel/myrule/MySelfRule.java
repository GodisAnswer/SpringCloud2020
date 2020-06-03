package com.daniel.myrule;

import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    @Bean
    public IRule MyRule(){
        //return new RoundRobinRule();
        return new ZoneAvoidanceRule();
    }
}
