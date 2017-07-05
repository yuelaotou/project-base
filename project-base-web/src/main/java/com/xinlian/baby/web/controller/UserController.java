/**
 * 
 */
package com.xinlian.baby.web.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.xinlian.baby.common.utils.JsonUtil;
import com.xinlian.baby.entity.User;
import com.xinlian.baby.service.IUserService;

/**
 * @author yangguang
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	IUserService userService;

	@RequestMapping("")
	public String a(Model mv) {
		mv.addAttribute("aaa","===asdasd===");
		return "user/user";
	}
	/**
	 * 新增15条数据测试
	 */
	@RequestMapping("/insert")
	public void insertUser() {
		User user = new User();
		user.setName("zhangsan");
		user.setAge(17);
		user.setPhone("13998885993");
		user.setCreateTime(new Date());
		user.setCreatePin("admin");
		user.setYn(1);
		logger.debug("====================");
		logger.info("====================");
		logger.warn("====================");
		logger.error("====================");
		for (int i = 0; i < 15; i++) {
			userService.insert(user);
		}
	}

	/**
	 * 全部删除测试
	 * 
	 * @return
	 */
	@RequestMapping("/delete")
	public int delete() {
		return userService.deleteById(1L) ? 1 : 0;
	}

	/**
	 * 全部删除测试
	 * 
	 * @return
	 */
	@RequestMapping("/deleteAll")
	public int deleteAll() {
		return userService.deleteAll();
	}

	/**
	 * 查询所有测试
	 * 
	 * @return
	 */
	@RequestMapping("/getAll")
	@ResponseBody
	public List<User> selectListBySQL() {
		return userService.selectListBySQL();
	}

	/**
	 * 分页查询测试，没有入参，只返回前10个信息
	 *
	 * @return
	 */
	@RequestMapping("/selectPage")
	@ResponseBody
	public Page<User> selectPage() {
		// 分页查询10条记录
		Page<User> userListPage = userService.selectPage(new Page<User>(1, 10), new EntityWrapper<>(new User()));
		System.out.println(JsonUtil.toJson(userListPage));
		userListPage.setTotal(15);
		return userListPage;
	}

	/**
	 * 修改测试
	 */
	@RequestMapping("/update")
	public void updateById() {
		// 修改一条记录
		userService.updateById(new User(1L, "yangguang", 35, "13998885993", new Date(), "yangg", 1));

	}

	/**
	 * 异常测试，关注事务
	 */
	@RequestMapping("/exception")
	public void testException() {
		userService.testException();
	}

}
