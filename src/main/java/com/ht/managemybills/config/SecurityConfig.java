package com.ht.managemybills.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

  @Bean
  InMemoryUserDetailsManager users() {
    return new InMemoryUserDetailsManager(
        User.withUsername("dan")
            .password("{noop}test1234")
            .roles("ADMIN")
            .build()
    );
  }
  @Bean
  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    return http.
        authorizeHttpRequests(auth -> {
          auth.anyRequest().authenticated();
        })
        .formLogin(Customizer.withDefaults())
        .build();
  }
}
