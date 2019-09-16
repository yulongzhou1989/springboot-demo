package com.yz.tweet;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(TweetController.class)
public class TweetControllerTest {
	@Autowired
    private MockMvc mvc;
 
    @MockBean
    private TweetService service;
    
    @Test
    public void givenTweets_whenGetTweets_thenReturnJsonArray()
      throws Exception {
         
        Tweet t = new Tweet(1L, "tweetController testing", 1L, "2019-01-01");
     
        List<Tweet> allTweets = Arrays.asList(t);
     
        given(service.getFollowedTweetsByUserId(1L)).willReturn(allTweets);
     
        mvc.perform(get("/feed/1")
          .contentType(MediaType.APPLICATION_JSON))
          .andExpect(status().isOk())
          .andExpect(jsonPath("$[0].userId", is(t.getUserId().intValue())));
    }
}
