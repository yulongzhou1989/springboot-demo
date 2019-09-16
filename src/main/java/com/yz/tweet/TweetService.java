package com.yz.tweet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class TweetService {
	
	@Autowired
	private TweetRepository tweetRepository;
	
	public List<Tweet> getTweetsByUserId(Long userId) {
		return tweetRepository.findbyUserId(userId);
	}
	
	public List<Tweet> getFollowedTweetsByUserId(Long userId) {
		Pageable page = PageRequest.of(0, 100, Sort.by("createTime").descending());
		return tweetRepository.findFollowedTweetsByUserId(userId, page).getContent();
	}
	
	public Tweet saveTweet(Tweet t) {
		return tweetRepository.save(t);
	}
	
	public List<Tweet> findAll() {
		return tweetRepository.findAll();
	}
}

