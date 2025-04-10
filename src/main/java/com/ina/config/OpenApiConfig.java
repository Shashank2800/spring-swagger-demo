package com.ina.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;

@Configuration
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi
                .builder()
                .group("public")
                .pathsToMatch("/api/**")
                .build();
    }

    @Bean
    public Info apiInfo() {
        return new Info()
                .title("My API")
                .description("This is the documentation for my API")
                .version("v1.0");
    }
}
