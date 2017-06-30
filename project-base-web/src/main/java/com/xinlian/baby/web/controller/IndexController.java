/**
 * 
 */
package com.xinlian.baby.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yangguang
 *
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	public String index(Model mv) {
		List<Map<String, Object>> friends = new ArrayList<Map<String, Object>>();
		Map<String, Object> friend = new HashMap<String, Object>();
		friend.put("name", "张三");
		friend.put("age", 20);
		friends.add(friend);
		friend = new HashMap<String, Object>();
		friend.put("name", "李四");
		friend.put("age", 22);
		friends.add(friend);
		mv.addAttribute("friends", friends);
		mv.addAttribute("name", "[Angel -- 守护天使]");
		mv.addAttribute("gender", 1);
		return "index";
	}
}
