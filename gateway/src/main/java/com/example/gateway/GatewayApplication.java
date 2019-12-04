package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    //    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("second_route", r -> r.path("/explore")
//                        .uri("https://github.com"))
//                .build();
//    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        //生成比當前時間早一個小時的UTC時間
//        ZonedDateTime minusTime = LocalDateTime.now().minusHours(1).atZone(ZoneId.systemDefault());
//        return builder.routes()
//                .route("after_route", r -> r.after(minusTime)
//                        .uri("https://github.com"))
//                .build();
//    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        //生成以當前時間隔一天的UTC時間
//        ZonedDateTime datetime = LocalDateTime.now().plusDays(1).atZone(ZoneId.systemDefault());
//        return builder.routes()
//                .route("before_route", r -> r.before(datetime)
//                .uri("https://github.com"))
//                .build();
//    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("cookie_route", r -> r.cookie("QwQ", "ouo.k")
//                        .uri("https://github.com"))
//                .build();
//    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("header_route", r -> r.header("X-Request-Id", "abc")
//                        .uri("https://github.com"))
//                .build();
//    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("host_route", r -> r.host("**.github.com")
//                        .uri("https://github.com"))
//                .build();
//    }

    //Method只有GET有效果，猜測是因為原本的API是設定成GET連結的方式
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("method_route", r -> r.method("POST")
//                        .uri("https://github.com"))
//                .build();
//    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("query_route", r -> r.query("foo","bar")
//                        .uri("https://github.com"))
//                .build();
//    }


//    @Bean
//    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(r -> r.path("/get")
//                        .filters(gatewayFilterSpec -> gatewayFilterSpec.stripPrefix(1)
//                                .addRequestHeader("MY_HEADER", "lpw")
//                                .addRequestParameter("MY_PARAM", "test")
//                        )
//                        .uri("http://localhost:8090"))
//                .build();
//    }

//    @Bean
//    public RouteLocator testRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("add_request_header_route", r ->
//                        r.path("/test").filters(f -> f.addRequestHeader("X-Request-Foo", "Bar"))
//                                .uri("http://localhost:8090/test/head/"))
//                .build();
//    }

//    @Bean
//    public RouteLocator testRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("add_request_parameter_route", r ->
//                        r.path("/addRequestParameter").filters(f -> f.addRequestParameter("example", "ValueB"))
//                                .uri("http://localhost:8090/test/addRequestParameter"))
//                .build();
//    }

//    @Bean
//    public RouteLocator testRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("rewritepath_route", r ->
//                        r.path("/foo/**").filters(f -> f.rewritePath("/foo/(?<segment>.*)","/$\\{segment}"))
//                                .uri("http://www.baidu.com"))
//                .build();
//    }

}
