package br.com.gateway.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@Bean
	public RouteLocator myRouters(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p
						.path("/api/users/**")
						.filters(f -> f.stripPrefix(2))
						.uri("lb://USER-SERVICE")) // Assuming "user-service" is the registered service name in Eureka
				.build();
	}
}
