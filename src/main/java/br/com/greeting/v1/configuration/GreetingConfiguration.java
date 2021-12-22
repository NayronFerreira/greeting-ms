package br.com.greeting.v1.configuration;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
@ConfigurationProperties("greeting-service")
@Data
@NoArgsConstructor
public class GreetingConfiguration {

	private String greeting;
	private String defaultValue;
}
