package com.yz.tweet;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tweet implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="CONTENT")
	private String content;
	
	@Column(name="USERID")
	private Long userId;
	
	@Column(name="CREATETIME")
	private String createTime;
	
	public Tweet() {
		
	}
	
	public Tweet(String content, Long userId) {
		this.content = content;
		this.userId = userId;
	}
	
	public Tweet(String content, Long userId, String createTime) {
		this.content = content;
		this.userId = userId;
		this.createTime = createTime;
	}
	
	public Tweet(Long id, String content, Long userId, String createTime) {
		this.content = content;
		this.userId = userId;
		this.id = id;
		this.createTime = createTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
