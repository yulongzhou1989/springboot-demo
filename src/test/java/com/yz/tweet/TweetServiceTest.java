package com.yz.tweet;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class TweetServiceTest {
	
	@TestConfiguration
    static class TweetServiceImplTestContextConfiguration {
  
        @Bean
        public TweetService employeeService() {
            return new TweetService();
        }
    }
 
    @Autowired
    private TweetService tweetService;
 
    @MockBean
    private TweetRepository tweetRepository;
    
    @Before
    public void setUp() {
        Tweet tweet = new Tweet(1L, "test tweet service", 1L, "2019-01-11");
        List<Tweet> mockList = new ArrayList<>();
        mockList.add(tweet);
        Mockito.when(tweetRepository.findbyUserId(tweet.getUserId()))
          .thenReturn(mockList);
    }
    
    @Test
    public void whenValidName_thenEmployeeShouldBeFound() {
        Long userId = 1L;
        List<Tweet> found = tweetService.getTweetsByUserId(userId);
      
        Assert.assertEquals(found.get(0).getUserId(), userId);
     }
    
}
