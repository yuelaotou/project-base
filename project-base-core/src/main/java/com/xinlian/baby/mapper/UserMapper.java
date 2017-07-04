package com.xinlian.baby.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Result;
//import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.xinlian.baby.entity.User;

/**
 * User 表数据库控制层接口
 */
public interface UserMapper {

	/**
	 * 自定义注入方法
	 */
	int deleteAll();

	@Select("select id, name, age, phone, create_time AS createTime, create_pin AS createPin, yn from user")
//	@Results({ @Result(property = "createTime", column = "create_time"),
//			@Result(property = "createPin", column = "create_pin") })
	List<User> selectListBySQL();

}