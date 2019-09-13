package com.yz.tweet;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TweetController {

	@Autowired
	private TweetService tweetService;
	
	@GetMapping("/feed/{userId}")
	@ResponseBody
	public ResponseEntity<List<Tweet>> feed(@PathVariable Long userId) {
		List<Tweet> res = tweetService.getFollowedTweetsByUserId(userId);
		return ResponseEntity.ok()
				.headers(new HttpHeaders())
				.body(res);
	}
	
	@PostMapping("/tweet/")
	@ResponseBody
	public ResponseEntity<Tweet> saveTweet(@Valid @RequestBody Tweet tweet) {
		
		Tweet result = tweetService.saveTweet(tweet);
		
		return ResponseEntity.ok()
	            .headers(new HttpHeaders())
	            .body(result);
	}
	
	@PutMapping("/tweet/")
	@ResponseBody
	public ResponseEntity<Tweet> updateTweet(@Valid @RequestBody Tweet tweet) {
		
		Tweet result = tweetService.saveTweet(tweet);
		
		return ResponseEntity.ok()
	            .headers(new HttpHeaders())
	            .body(result);
	}
}
