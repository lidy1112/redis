package com.lidy.redis.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI openAPI() {

		Server server = new Server();
		server.setUrl("https://www.lidy.synology.me/redis");

		return new OpenAPI()
			.servers(List.of(server));
	}
}
