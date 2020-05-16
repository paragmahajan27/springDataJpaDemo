package io.github.paragmahajan27;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = SpringDataJpaDemo.class)
public class SpringDataJpaDemo {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaDemo.class, args);
	}

}
