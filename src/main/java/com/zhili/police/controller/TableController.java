package com.zhili.police.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhili.police.mapper.CityMapper;

@Controller
@RequestMapping("/")
public class TableController {

	static Logger logger = LoggerFactory.getLogger(TableController.class);

	@Autowired
	private CityMapper cityMapper;

	@RequestMapping(value = "/{reader}", method = RequestMethod.GET)
	public String get(@PathVariable("reader") String reader, Model model) {
		cityMapper.findByState("CA");
		logger.info(reader);
		return "readingList";
	}

}
