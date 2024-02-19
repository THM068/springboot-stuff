package com.ht.managemybills;

import com.ht.managemybills.config.SocialMediaProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SocialMediaProperties.class)
public class ManagemybillsApplication {

  public static void main(String[] args) {
    SpringApplication.run(ManagemybillsApplication.class, args);
  }

}
