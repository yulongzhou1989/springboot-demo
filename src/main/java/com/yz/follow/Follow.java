package com.yz.follow;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Follow implements Serializable {
	
	@EmbeddedId
	private FollowIdentity followId;
	
	public Follow() {
		
	}
	
	public Follow(FollowIdentity followId) {
		this.followId = followId;
	}

	public FollowIdentity getFollowId() {
		return followId;
	}

	public void setFollowId(FollowIdentity followId) {
		this.followId = followId;
	}
}
