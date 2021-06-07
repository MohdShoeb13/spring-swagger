package com.spring.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class BookConfig {
     
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Shoeb dev").apiInfo(apiInfo()).select()
				.paths(regex("/book.*")).build();
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Book Service")
				.description("Sample Documentaion generated using SWAGGER2")
				.termsOfServiceUrl("https://www.youtube.com")
				.license("Java_dev Liscence")
				.licenseUrl("https://www.youtube.com").version("1.0").build();
	}
	
}
