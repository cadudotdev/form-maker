package com.cadudotdev.formmaker.services.builder;

public interface FormBuilderService
{
	Object buildForm(Long id);

	Object buildOrGetDemoForm();
}
