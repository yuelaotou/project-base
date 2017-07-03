/**
 * 
 */
package com.xinlian.baby.web.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xinlian.baby.common.utils.JsonUtil;
import com.xinlian.baby.entity.User;
import com.xinlian.baby.service.UserService;

/**
 * @author yangguang
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	/**
	 * 全部删除测试
	 * 
	 * @return
	 */
	@RequestMapping("/delete")
	public int deleteAll() {
		return userService.deleteAll();
	}

	/**
	 * 查询所有测试
	 * 
	 * @return
	 */
	@RequestMapping("/getAll")
	public List<User> selectListBySQL() {
		return userService.selectListBySQL();
	}
//
//	/**
//	 * 分页查询测试，没有入参，只返回前10个信息
//	 * 
//	 * @return
//	 */
//	@RequestMapping("/selectPage")
//	public Page<User> selectPage() {
//		return userService.selectPage(new Page<User>(0, 10));
//	}
//
//	/**
//	 * CURD各种测试
//	 */
//	@RequestMapping("/curd")
//	public User curdTest() {
//		// 新增一条记录
//		userService.insertOrUpdate(new User(1L, "yangguang", 35, "13998885993", new Date(), "yangg", 1));
//		// 修改一条记录
//		userService.updateById(new User(1L, "yangguang", 35, "13998885993", new Date(), "yangg", 0));
//		// 删除一条记录
//		userService.deleteById(1L);
//		// 删除所有记录
//		userService.deleteAll();
//		// 新增15条数据
//		for (int i = 0; i < 15; ++i) {
//			userService.insert(new User("zhangsan", 17 + i, "13888888888"));
//		}
//		// 分页查询10条记录
//		Page<User> userListPage = userService.selectPage(new Page<User>(0, 10), new EntityWrapper<>(new User()));
//		System.out.println(JsonUtil.toJson(userListPage));
//		return userService.selectById(1L);
//	}

}
