package com.example.sayeedurdemo01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloWorldController.class) // Only load the HelloWorldController
public class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void helloWorld_ShouldReturnDefaultMessage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk()) // Check if HTTP status is 200
                .andExpect(content().string("Hello, World pipleline test!")); // Check the response body content
    }
}