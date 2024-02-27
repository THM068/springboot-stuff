package com.ht.managemybills.config;

import com.ht.managemybills.controllers.BasicAuthHandlerInterceptor;
import com.ht.managemybills.controllers.LogHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new LogHandlerInterceptor()).order(2);
    registry.addInterceptor(new BasicAuthHandlerInterceptor()).order(1);

  }
}
