package com.example.gateway.filter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

/**
 * 统计某个或者某种路由的的处理时长
 * @author xujin
 */
@Component
public class CustomGatewayFilter implements GatewayFilter, Ordered {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(CustomGatewayFilter.class));
    private static final Log log = LogFactory.getLog(GatewayFilter.class);
    private static final String COUNT_Start_TIME = "countStartTime";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        exchange.getAttributes().put(COUNT_Start_TIME, System.currentTimeMillis());
        return chain.filter(exchange).then(
                Mono.fromRunnable(() -> {
                    Long startTime = exchange.getAttribute(COUNT_Start_TIME);
                    Long endTime=(System.currentTimeMillis() - startTime);
                    if (startTime != null) {
                        log.info(exchange.getRequest().getURI().getRawPath() + ": " + endTime + "ms");
                    }
                })
        );
    }

    /**
     过滤器存在优先级，order越大，优先级越低
     */
    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}

