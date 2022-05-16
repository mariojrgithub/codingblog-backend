package com.codingblog.codingblog.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingblog.codingblog.entity.BlogEntry;
import com.codingblog.codingblog.repository.BlogEntryRepository;

@Service
public class BlogEntryServiceImpl implements BlogEntryService {
	
	@Autowired
	private BlogEntryRepository blogEntryRepository;

	@Override
	public BlogEntry addNewBlogEntry(BlogEntry blogEntry) {
		return blogEntryRepository.save(blogEntry);
	}

	@Override
	public List<BlogEntry> fetchAllBlogEntries() {
		return blogEntryRepository.findAll();
	}

	@Override
	public BlogEntry fetchOneBlogEntry(Long id) {
		return blogEntryRepository.findBlogEntryById(id);
	}

	@Override
	public BlogEntry updateBlogEntry(BlogEntry blogEntry) {
		return blogEntryRepository.save(blogEntry);
	}

	@Override
	@Transactional
	public void deleteBlogEntry(Long id) {
		blogEntryRepository.deleteBlogEntryById(id);
	}

}
