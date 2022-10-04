package com.example.noronshop.service.impl;
import com.example.noronshop.data.data.Category;
import com.example.noronshop.data.mapper.CategoryMapper;
import com.example.noronshop.data.request.CategoryRequest;
import com.example.noronshop.repository.CategoryRepository;
import com.example.noronshop.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService implements IService<CategoryRequest> {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<CategoryRequest> findAll() {
        List<Category> categories = categoryRepository.findAll();
        List<CategoryRequest> ListCategoryRequest = new ArrayList<>();
        for(Category category : categories){
            CategoryRequest categoryRequest =  categoryMapper.toRequest(category);
            ListCategoryRequest.add(categoryRequest);
        }
        return ListCategoryRequest;
    }

    @Override
    public  CategoryRequest findById(int id) {
        Category category = categoryRepository.getById(id);
        CategoryRequest categoryRequest = categoryMapper.toRequest(category);
        return categoryRequest;
    }

    @Override
    public CategoryRequest save(CategoryRequest categoryRequest) {
        Category category = categoryMapper.toPojo(categoryRequest);
        categoryRepository.save(category);
        return  categoryRequest;
    }

    @Override
    public CategoryRequest update(int id,CategoryRequest categoryRequest) {
        Category category = categoryMapper.toPojo(categoryRequest);
        categoryRepository.save(category);
        return  categoryRequest;
    }

    @Override
    public CategoryRequest remove(int id) {
        Category category = categoryRepository.getById(id);
        CategoryRequest categoryRequest = categoryMapper.toRequest(category);
        if(category == null){
            return null;
        }
        categoryRepository.deleteById(id);
        return categoryRequest;
    }
}
