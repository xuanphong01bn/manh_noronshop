package com.example.noronshop.data.mapper;

import com.example.noronshop.data.data.Category;
import com.example.noronshop.data.request.CategoryRequest;
import com.example.noronshop.data.response.CategoryResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category toPojo(CategoryRequest categoryRequest);

    CategoryRequest toRequest(Category category);

}
