package com.ffcs.oss.controller;

import com.ffcs.oss.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/Freemarker")
public class TestFreemarker {
	@RequestMapping(value = "/testFreemarker")
	@ResponseBody
	public ModelAndView testFreemarker(@RequestParam(value = "a", required = false) String a) throws Exception {
		ModelAndView mv = new ModelAndView();

		User user = new User("may", 21);

		List<String> list = new ArrayList<String>();
		list.add("Jack1");
		list.add("Jack2");
		list.add("Jack3");

		mv.addObject("list", list);
		mv.addObject("user", user);
		mv.addObject("param", new String(a.getBytes("iso8859-1"), "utf-8"));
		mv.setViewName("may");
		return mv;
	}
}
