package com.cadudotdev.formmaker.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TextFieldRepository extends JpaRepository<TextField, Long>
{
	List<TextField> findByParentId(Long parentId);
}
