package br.com.analytics.customermetrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CustomerMetricsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerMetricsApplication.class, args);
	}

}
