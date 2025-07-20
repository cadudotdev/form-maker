package com.cadudotdev.formmaker.services;

public interface FormService
{
	Object buildFormById(Long id);
	Object buildOrGetDemoForm();
}
