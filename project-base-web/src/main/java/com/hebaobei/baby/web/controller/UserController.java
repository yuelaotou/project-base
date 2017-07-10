/**
 *
 */
package com.hebaobei.baby.web.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.hebaobei.baby.common.utils.JsonUtil;
import com.hebaobei.baby.entity.User;
import com.hebaobei.baby.service.IUserService;
import com.hebaobei.baby.vo.Result;
import com.hebaobei.baby.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

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
		mv.addAttribute("aaa",new Date());
		return "user/user";
	}


	/**
	 * 分页查询（userVO中含有查询条件）
	 *
	 * @return
	 */
	@RequestMapping("/selectPage")
	@ResponseBody
	public Page<User> selectPage(UserVO userVO) {
		System.out.println(userVO);
		// 分页查询
		Page<User> userListPage = userService.selectPage(userVO);
		logger.debug(JsonUtil.toJson(userListPage));
		return userListPage;
	}



	@RequestMapping("/toUserAddPage")
	public String toUserAddPage(Model modal) {
		//modal.addAttribute("aaa",new Date());
		return "user/userAdd";
	}

	@RequestMapping("/addUser")
	@ResponseBody
	public Result addUser(Model modal, User user) {
		Result result = new Result();
		try {
			user.setCreateTime(new Date());
			user.setYn(1);
			user.setCreatePin("test");
			boolean success = userService.insert(user);
			result.setSuccess(success);
		} catch (Exception e) {
			logger.error("addUser error:" + e.getMessage());
			result.setSuccess(false);
			result.setMessage(e.getMessage());
		}
		return result;
	}



	@RequestMapping("/toUserEditPage")
	public String toUserEditPage(Model modal, Long id) {
		User user = userService.selectById(id);
		modal.addAttribute("user",user);
		return "user/userEdit";
	}

	@RequestMapping("/updateUser")
	@ResponseBody
	public Result updateUser(Model modal, User user) {
		Result result = new Result();
		try {
			boolean success = userService.updateById(user);
			result.setSuccess(success);
		} catch (Exception e) {
			logger.error("updateUser error:" + e.getMessage());
			result.setSuccess(false);
			result.setMessage(e.getMessage());
		}
		return result;
	}

	@RequestMapping("/deleteUser")
	@ResponseBody
	public Result deleteUser(Model modal, Long id) {
		Result result = new Result();
		try {
			User user = new User();
			user.setYn(0);
			user.setId(id);
			boolean success = userService.updateById(user);
			result.setSuccess(success);
		} catch (Exception e) {
			logger.error("deleteUser error:" + e.getMessage());
			result.setSuccess(false);
			result.setMessage(e.getMessage());
		}
		return result;
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

//	/**
//	 * 分页查询测试，没有入参，只返回前10个信息
//	 *
//	 * @return
//	 */
//	@RequestMapping("/selectPage")
//	@ResponseBody
//	public Page<User> selectPage(UserVO userVO, int limit, int offset, int current) {
//		System.out.println(userVO);
//		System.out.println(limit);
//		System.out.println(offset);
//		System.out.println(current);
//		// 分页查询10条记录
//		Page<User> userListPage = userService.selectPage(new Page<User>(current, limit), new EntityWrapper<>(new User()));
//		System.out.println(JsonUtil.toJson(userListPage));
//		userListPage.setTotal(15);
//		return userListPage;
//	}



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
