package com.wlg;

import com.wlg.model.PeopleBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}

	@Bean
	@ConfigurationProperties(prefix = "com.example.demo")
	public PeopleBean people() {
		return new PeopleBean();
	}
}
