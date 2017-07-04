package com.xinlian.baby.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Result;
//import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xinlian.baby.entity.User;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yangguang
 * @since 2017-07-04
 */
public interface UserMapper extends BaseMapper<User> {

	/**
	 * 自定义注入方法
	 */
	int deleteAll();

	@Select("select id, name, age, phone, create_time AS createTime, create_pin AS createPin, yn from user")
	List<User> selectListBySQL();

}