package com.blogapp.blogger.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogapp.blogger.entities.Blog;
import com.blogapp.blogger.repositories.IBlogRepository;

@Service
public class PublishService implements Runnable{
	List<Blog> listOfBlogs;
	
	@Autowired
	IBlogRepository blogRepository;
	
	
	
	public List<Blog> getListOfBlogs() {
		return listOfBlogs;
	}



	public void setListOfBlogs(List<Blog> listOfBlogs) {
		this.listOfBlogs = listOfBlogs;
	}

	//Marking this transactional works
	//@Transactional
	public void run(){
		listOfBlogs.stream().forEach((blog) -> blogRepository.save(blog));
	}

	
}
