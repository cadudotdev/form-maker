package com.cadudotdev.formmaker.services;

import com.cadudotdev.formmaker.services.builder.FormBuilderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormServiceImpl implements FormService
{
	@Autowired
	FormBuilderService formBuilder;

	@Override
	public Object buildFormById(Long id)
	{
		return formBuilder.buildForm(id);
	}

	@Override
	public Object buildOrGetDemoForm()
	{
		return formBuilder.buildOrGetDemoForm();
	}
}
