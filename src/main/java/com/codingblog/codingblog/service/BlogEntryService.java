package com.codingblog.codingblog.service;

import java.util.ArrayList;
import java.util.List;

import com.codingblog.codingblog.entity.BlogEntry;

public interface BlogEntryService {
	
	public BlogEntry addNewBlogEntry(BlogEntry blogEntry);
	
	public List<BlogEntry> fetchAllBlogEntries();
	
	public BlogEntry fetchOneBlogEntry(Long id);
	
	public BlogEntry updateBlogEntry(BlogEntry blogEntry);
	
	public void deleteBlogEntry(Long id);

}
