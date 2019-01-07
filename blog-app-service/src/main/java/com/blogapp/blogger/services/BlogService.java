package com.blogapp.blogger.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogapp.blogger.entities.Blog;
import com.blogapp.blogger.repositories.IBlogRepository;

@Service
public class BlogService {
	
	@Autowired
	IBlogRepository blogRepository;
	
	@Autowired
	PublishService publishService;
	
	public boolean saveBlog(List<Blog> blogs){
		//This Works
		/*blogs.stream().forEach((blog) -> {
			blogRepository.save(blog);
		});*/
		
		publishService.setListOfBlogs(blogs);
		publishService.run();
		return true;
	}

}
