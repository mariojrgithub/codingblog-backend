package com.codingblog.codingblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingblog.codingblog.entity.BlogEntry;

public interface BlogEntryRepository extends JpaRepository<BlogEntry, Long> {
	
	void deleteBlogEntryById(Long id);
	
	BlogEntry findBlogEntryById(Long id);

}
