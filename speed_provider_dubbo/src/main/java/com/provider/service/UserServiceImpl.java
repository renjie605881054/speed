package com.provider.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.common.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String login() {
		System.out.println("login..." + new Date());
		return null;
	}

}
