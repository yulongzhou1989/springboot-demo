package com.yz.tweet;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TweetRepositoryIntegrationTest {
	
	@Autowired
    private TestEntityManager entityManager;
 
    @Autowired
    private TweetRepository tweetRepository;
    
	@Test
	public void whenFindByUserId_TweetRepository() {
	    // given
	    Tweet t = new Tweet("integration testing content", 1L, "2019-01-06");
	    entityManager.persist(t);
	    entityManager.flush();
	    
	    // when
	    List<Tweet> found = tweetRepository.findbyUserId(t.getUserId());
	    List<Tweet> testList = new ArrayList<>();
	    testList.add(t);
	    
	    Assert.assertEquals(found.get(0).getId(), testList.get(0).getId());
	}
	
}
