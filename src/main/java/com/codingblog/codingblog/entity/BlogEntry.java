package com.codingblog.codingblog.entity;


import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class BlogEntry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String content;
	@CreationTimestamp
	private Timestamp timestamp;
	private int upvotes;
	private int downvotes;

	public BlogEntry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BlogEntry(String name, String content, Timestamp timestamp, int upvotes, int downvotes) {
		super();
		this.name = name;
		this.content = content;
		this.timestamp = timestamp;
		this.upvotes = upvotes;
		this.downvotes = downvotes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public int getUpvotes() {
		return upvotes;
	}

	public void setUpvotes(int upvotes) {
		this.upvotes = upvotes;
	}

	public int getDownvotes() {
		return downvotes;
	}

	public void setDownvotes(int downvotes) {
		this.downvotes = downvotes;
	}

	@Override
	public String toString() {
		return "BlogEntry [id=" + id + ", name=" + name + ", content=" + content + ", timestamp=" + timestamp
				+ ", upvotes=" + upvotes + ", downvotes=" + downvotes + "]";
	}

}
