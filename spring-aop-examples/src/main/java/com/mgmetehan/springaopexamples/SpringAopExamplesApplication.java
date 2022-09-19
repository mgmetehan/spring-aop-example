package com.mgmetehan.springaopexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringAopExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopExamplesApplication.class, args);
	}
}
