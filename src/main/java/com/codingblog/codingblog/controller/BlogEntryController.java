package com.codingblog.codingblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingblog.codingblog.entity.BlogEntry;
import com.codingblog.codingblog.service.BlogEntryServiceImpl;

@RestController
@RequestMapping("/blog")
@CrossOrigin(origins = "http://localhost:4200")
public class BlogEntryController {
	
	@Autowired
	private BlogEntryServiceImpl blogEntryServiceImpl;

	@GetMapping("/all")
	public ResponseEntity<List<BlogEntry>> getAllBlogEntries(){
		List<BlogEntry> blogEntries = blogEntryServiceImpl.fetchAllBlogEntries();
		
		return new ResponseEntity<List<BlogEntry>>(blogEntries, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<BlogEntry> getOneBlogEntry(@PathVariable("id") Long id){
		BlogEntry blogEntry = blogEntryServiceImpl.fetchOneBlogEntry(id);
		
		return new ResponseEntity<BlogEntry>(blogEntry, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<BlogEntry> addOneBlogEntry(@RequestBody BlogEntry blogEntry){
		BlogEntry newBlogEntry = blogEntryServiceImpl.addNewBlogEntry(blogEntry);
		
		return new ResponseEntity<BlogEntry>(newBlogEntry, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<BlogEntry> updateOneBlogEntry(@RequestBody BlogEntry blogEntry){
		BlogEntry newBlogEntry = blogEntryServiceImpl.updateBlogEntry(blogEntry);
		
		return new ResponseEntity<BlogEntry>(newBlogEntry, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteBlogEntry(@PathVariable("id") Long id){
		blogEntryServiceImpl.deleteBlogEntry(id);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
