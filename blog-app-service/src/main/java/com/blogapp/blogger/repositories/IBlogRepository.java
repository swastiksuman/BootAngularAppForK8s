package com.blogapp.blogger.repositories;

import org.springframework.data.repository.CrudRepository;

import com.blogapp.blogger.entities.Blog;

public interface IBlogRepository extends CrudRepository<Blog, Long>{

}
