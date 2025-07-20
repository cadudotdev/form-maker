package com.cadudotdev.formmaker.services.builder;

import com.cadudotdev.formmaker.model.Form;
import com.cadudotdev.formmaker.model.FormRepository;
import com.cadudotdev.formmaker.model.TextField;
import com.cadudotdev.formmaker.model.TextFieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormBuilderServiceImpl implements FormBuilderService
{
	@Autowired
	FormRepository formRepository;
	@Autowired
	TextFieldRepository textFieldRepository;

	@Override
	public Object buildForm(Long id)
	{
		textFieldRepository.findByParentId(id);
		return id.toString();
	}

	@Override
	public Object buildOrGetDemoForm()
	{
		Form form1 = new Form();

		form1.setName("Form 1");
		form1.setCode("form1");

		Long formId = formRepository.save(form1).getId();

		TextField textField1 = new TextField();

		textField1.setParentId(formId);
		textField1.setName("textField1");
		textField1.setCode("txt1");
		textField1.setValue("demo1");

		textFieldRepository.save(textField1);

		TextField textField2 = new TextField();

		textField2.setParentId(formId);
		textField2.setName("textField2");
		textField2.setCode("txt2");
		textField2.setValue("demo2");

		textFieldRepository.save(textField2);

		return null;
	}
}
