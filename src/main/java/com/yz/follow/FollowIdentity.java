package com.yz.follow;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class FollowIdentity implements Serializable {
	
	@NotNull
	private Long userId;
	
	@NotNull
	private Long followId;
	
	public FollowIdentity() {
		
	}
	
	public FollowIdentity(Long userId, Long tweetId) {
		this.userId = userId;
		this.followId = tweetId;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		
		if (!userId.equals(((FollowIdentity)o).userId)) {
			return false;
		}
		
		return followId.equals(((FollowIdentity)o).followId);
	}
	
	
	@Override
	public int hashCode() {
		int res = userId.hashCode();
		return res * 31 + followId.hashCode();
	}
}
