package com.yz.follow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FollowService {
	
	@Autowired
	private FollowRepository followRepository;

	
	public void follow(Long userId, Long followId) {
		followRepository.save(new Follow(new FollowIdentity(userId, followId)));
	}
	
	public void unfollow(Long userId, Long followId) {
		followRepository.delete(new Follow(new FollowIdentity(userId, followId)));
	}
}
