package com.xinlian.baby.service;

import java.util.List;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.xinlian.baby.entity.User;
import com.xinlian.baby.vo.UserVO;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author yangguang
 * @since 2017-07-04
 */
public interface IUserService extends IService<User> {

	int deleteAll();

	List<User> selectListBySQL();

	void testException();

	Page<User> selectPage(UserVO userVO);
}