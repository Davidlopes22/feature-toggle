package com.mentoria.featureToggle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FeatureToggleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeatureToggleApplication.class, args);
	}

}
