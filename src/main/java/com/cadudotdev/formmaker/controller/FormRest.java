package com.cadudotdev.formmaker.controller;

import com.cadudotdev.formmaker.services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/form")
public class FormRest
{
	@Autowired
	private FormService service;

	@GetMapping
	@ResponseBody
	public Object getForm() {
		return service.buildFormById(123L);
	}

	@GetMapping("/create-demo")
	@ResponseBody
	public Object createDemoForm() {
		return service.buildOrGetDemoForm();
	}
}
