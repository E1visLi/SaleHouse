package zsc.gof.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller//标志为控制器
public class Base {
	@RequestMapping("/index")//访问地址
	public  ModelAndView index() {
		return new ModelAndView("test");
	}
}
