package com.ani;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ani.service.AddService;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView sum(@RequestParam("first") int i, @RequestParam("second") int j,HttpServletRequest request , HttpServletResponse response){
		
		ModelAndView mv = new ModelAndView();
		AddService as = new AddService();
		
		int k = as.addNum(i, j);
		mv.setViewName("display");
		mv.addObject("result",k);
		return mv;
	}

}
