package com.iiht.training.blogs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.blogs.dto.BlogDto;
import com.iiht.training.blogs.repository.BlogRepository;
import com.iiht.training.blogs.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogRepository blogRepository;

	@Override
	public BlogDto createBlog(BlogDto blogDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlogDto getBlogById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlogDto updateBlog(Long id, BlogDto blogDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteBlog(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
