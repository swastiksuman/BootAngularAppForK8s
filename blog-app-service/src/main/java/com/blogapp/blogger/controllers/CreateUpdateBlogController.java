package com.blogapp.blogger.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blogapp.blogger.entities.Blog;
import com.blogapp.blogger.repositories.IBlogRepository;
import com.blogapp.blogger.services.BlogService;

@CrossOrigin
@RestController
public class CreateUpdateBlogController {
	
	@Autowired
	IBlogRepository blogRepository;
	
	@Autowired
	BlogService blogService;
	
	@PostMapping("/saveBlog")
	public Blog createBlog(@RequestBody Blog blog){
		return blogRepository.save(blog);
	}
	
	@GetMapping("getBlogs")
	public List<Blog> getAllBlogs(){
		List<Blog> blogs = new ArrayList<Blog>();
		blogRepository.findAll().forEach((blog) -> blogs.add(blog));
		return blogs;
	}
	
	@PostMapping("/massSaveBlog")
	public boolean saveMassBlogs(){
		List<Blog> blogs = new ArrayList<Blog>();
		blogs.add(new Blog("A", "AAA"));
		blogs.add(new Blog("B", "BBB"));
		blogs.add(new Blog());
		return blogService.saveBlog(blogs);
	}
	
}
