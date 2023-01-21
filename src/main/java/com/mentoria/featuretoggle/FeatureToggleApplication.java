package com.mentoria.featuretoggle;

import com.mentoria.featuretoggle.infrastructure.utils.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class FeatureToggleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeatureToggleApplication.class, args);
	}

}
