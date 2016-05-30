/**
 * 
 */
package com.dandelion.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dandelion.model.UserEntity;
import com.dandelion.service.UserService;
import com.dandelion.util.MyTool;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@ResponseBody
	@RequestMapping(value = "/login")
	public Map<String, Object> login(UserEntity user) {
		Map<String, Object> map = new HashMap<String, Object>();

		System.out.println(user.toString());
		String pwd = MyTool.MD5(user.getPassword());
		user.setPassword(pwd);
		boolean ret = userService.isExist(user);
		map.put("success", ret);
		return map;
	}

	@ResponseBody
	@RequestMapping(value = "/regist")
	public Map<String, Object> regist(UserEntity user) {
		Map<String, Object> map = new HashMap<String, Object>();
		String pwd = MyTool.MD5(user.getPassword());
		user.setPassword(pwd);
		boolean ret = userService.addUser(user);
		System.out.println(ret);
		map.put("success", ret);
		System.out.println(map);
		return map;
	}

	/**
	 * 
	 * @param id
	 * @param request
	 * @param response
	 * @return map
	 */
	@ResponseBody
	@RequestMapping(value = "/delete")
	public Map<String, Object> delete(@RequestParam(value = "id") int id,
			HttpServletRequest request, HttpServletResponse response) {
		System.out.println(id);
		UserEntity user = new UserEntity();
		user.setId(id);
		Map<String, Object> map = new HashMap<String, Object>();
		boolean ret = true;
		try {
			ret = userService.deleteUser(user);
		} catch (Throwable e) {
			System.out.println(e);
		}
		map.put("success", ret);
		System.out.println(map);
		return map;
	}
}
