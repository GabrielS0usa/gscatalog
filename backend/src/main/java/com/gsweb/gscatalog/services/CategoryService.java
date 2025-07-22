package com.gsweb.gscatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsweb.gscatalog.dto.CategoryDTO;
import com.gsweb.gscatalog.entities.Category;
import com.gsweb.gscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<CategoryDTO> findAll() {
		List<Category> list = repository.findAll();
		List<CategoryDTO> listDto = list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
		return listDto;
	}
}
