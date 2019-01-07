package com.blogapp.blogger.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Required;

@Entity
@Table(name = "BLOG")
public class Blog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	@NotNull
	public String blogTitle;
	public String blogBody;

	public Blog() {
		super();
	}

	public Blog(String blogTitle, String blogBody) {
		super();
		this.blogTitle = blogTitle;
		this.blogBody = blogBody;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogBody() {
		return blogBody;
	}

	public void setBlogBody(String blogBody) {
		this.blogBody = blogBody;
	}

}
