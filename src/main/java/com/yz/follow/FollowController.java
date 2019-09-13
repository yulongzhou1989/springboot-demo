package com.yz.follow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yz.tweet.Tweet;

@Controller
public class FollowController {
	
	@Autowired
	private FollowService followService;
	
	@GetMapping("/follow/{userId}/{followId}")
	@ResponseBody
	public String follow(@PathVariable Long userId, @PathVariable Long followId) {
		followService.follow(userId, followId);
		return "success";
	}
	
	@GetMapping("/unfollow/{userId}/{followId}")
	@ResponseBody
	public String unfollow(@PathVariable Long userId, @PathVariable Long followId) {
		followService.unfollow(userId, followId);
		return "success";
	}
	
	@GetMapping("/")
	@ResponseBody
	public String welcome() {
		return "success";
	}
}
