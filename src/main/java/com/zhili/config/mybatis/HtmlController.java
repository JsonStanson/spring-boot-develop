package com.zhili.config.mybatis;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/manager")
public class HtmlController {

	@RequestMapping(value = "/{reader}", method = RequestMethod.GET)
	public String view(@PathVariable("reader") String reader, Model model) {
		return "manager/" + reader;
	}

}
