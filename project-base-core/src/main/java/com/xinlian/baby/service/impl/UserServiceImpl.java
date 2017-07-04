package com.xinlian.baby.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xinlian.baby.entity.User;
import com.xinlian.baby.mapper.UserMapper;
import com.xinlian.baby.service.IUserService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yangguang
 * @since 2017-07-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public int deleteAll() {
		return baseMapper.deleteAll();
	}

	@Override
	public List<User> selectListBySQL() {
		return baseMapper.selectListBySQL();
	}

	@Override
	@Transactional
	public void testException() {
		baseMapper.deleteAll();
		baseMapper.insert(new User("yangguasdasdadasdasdaddsadang", 35, "13998885993", new Date(), "yangg", 1));
	}

}