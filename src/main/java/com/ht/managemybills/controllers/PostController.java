package com.ht.managemybills.controllers;

import com.ht.managemybills.entities.Post;
import jakarta.annotation.security.PermitAll;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

  @GetMapping
  @PermitAll
  public List<Post> getPosts() {
    return List.of(new Post("First Post", "This is the first post!"), new Post("Second Post", "This is the second post!"));
  }

  @GetMapping("/{id}")
  @PermitAll
  public Post getPost(Long id) {
    return new Post("First Post", "This is the first post!");
  }

  @PostMapping
  public Post createPost(@RequestBody Post post) {
    return post;
  }
}
