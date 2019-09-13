package com.yz.follow;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yz.tweet.Tweet;

public interface FollowRepository extends JpaRepository<Follow, FollowIdentity>{
	
}
