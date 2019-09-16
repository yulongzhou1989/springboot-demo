package com.yz.tweet;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
	
	@Query(value = "SELECT * FROM tweet t WHERE t.userId = :userId order by createTime desc", nativeQuery = true)
	List<Tweet> findbyUserId(@Param("userId") Long userId);
	
	@Query(value = "SELECT t.* FROM tweet t LEFT JOIN follow f ON t.userId = f.followId WHERE f.userId = :userId", nativeQuery = true)
	Page<Tweet> findFollowedTweetsByUserId(Long userId, Pageable page);
}
