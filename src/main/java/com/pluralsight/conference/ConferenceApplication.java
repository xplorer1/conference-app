package com.pluralsight.conference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class ConferenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConferenceApplication.class, args);
	}

}
