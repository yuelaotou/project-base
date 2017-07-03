package com.xinlian.baby.service;

import java.util.List;

import com.xinlian.baby.entity.User;

/**
 *
 * User 表数据服务层接口
 *
 */
public interface UserService {

	int deleteAll();

	List<User> selectListBySQL();
}