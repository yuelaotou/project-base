package com.xinlian.baby.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinlian.baby.entity.User;
import com.xinlian.baby.mapper.UserMapper;
import com.xinlian.baby.service.UserService;

/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public int deleteAll() {
		return userMapper.deleteAll();
	}

	@Override
	public List<User> selectListBySQL() {
		return userMapper.selectListBySQL();
	}

}