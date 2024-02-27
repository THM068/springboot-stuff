package com.ht.managemybills;

import com.ht.managemybills.config.SocialMediaProperties;
import com.ht.managemybills.entities.Post;
import com.ht.managemybills.entities.User;
import com.ht.managemybills.repositories.PostRepository;
import com.ht.managemybills.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SocialMediaProperties.class)
public class ManagemybillsApplication {

  public static void main(String[] args) {
    SpringApplication.run(ManagemybillsApplication.class, args);
  }

  //@Bean
  CommandLineRunner commandLineRunner(PostRepository postRepository,
      UserRepository userRepositoryr) {
    return  args -> {
      var post = new Post("First Post", "This is the first post");
      postRepository.save(post);

    };
  }

}
