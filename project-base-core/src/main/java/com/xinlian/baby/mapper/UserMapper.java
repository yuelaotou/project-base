package com.xinlian.baby.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.xinlian.baby.entity.User;

/**
 * User 表数据库控制层接口
 */
@Mapper
public interface UserMapper {

	/**
	 * 自定义注入方法
	 */
	int deleteAll();

	@Select("select id, name, age, phone, create_time, create_pin, yn from user")
	List<User> selectListBySQL();

}