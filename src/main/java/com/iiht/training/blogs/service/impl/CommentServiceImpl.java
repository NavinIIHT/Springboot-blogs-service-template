package com.iiht.training.blogs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.blogs.dto.CommentDto;
import com.iiht.training.blogs.repository.CommentRepository;
import com.iiht.training.blogs.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;

	@Override
	public CommentDto postComment(CommentDto commentDto) {
		return null;
	}

}
