package com.ht.managemybills;

import com.ht.managemybills.controllers.PostController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content

@WebMvcTest(PostController.class)
public class PostControllerApiTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  @DisplayName("GET /posts returns a list of posts")
  void shouldReturnAListOfPosts() throws Exception {
    //when:
    mockMvc.perform(get("/api/posts"))
        .andDo(print())
        //then:
        .andExpectAll(
            status().isOk()
        );
//        .andExpect(jsonPath("$._embedded.posts").exists());

  }

}
