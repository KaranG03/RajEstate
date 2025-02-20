package com.karan.property.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/", "classpath:/public/", "file:external-resources/");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/sign-up").setViewName("sign-up");

        registry.addViewController("/colonies-list").setViewName("colonies-list");
        registry.addViewController("/customers").setViewName("customers");


        registry.addViewController("/plot").setViewName("plot");
        registry.addViewController("/plot-edit").setViewName("plot-edit");
        registry.addViewController("/add-colony").setViewName("add-colony");
        registry.addViewController("/forgot-password").setViewName("forgot-password");
        registry.addViewController("/otp**").setViewName("otp");
        registry.addViewController("/reset-password").setViewName("reset-password");
        registry.addViewController("/signup").setViewName("signup");
    }


}
