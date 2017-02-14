package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.dao.BaseDao;
import com.model.User;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	private BaseDao baseDao;
	@Resource
	private SqlSessionTemplate sqlSession;

	@Override
	public List<User> finUser() {
		return sqlSession.selectList("UserMapper.findUser");
	}
}
