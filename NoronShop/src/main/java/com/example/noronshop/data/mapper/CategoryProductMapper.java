package com.example.noronshop.data.mapper;

import com.example.noronshop.data.data.CategoryProduct;
import com.example.noronshop.data.request.CategoryProductRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryProductMapper {
    CategoryProduct toPojo(CategoryProductRequest categoryProductRequest);

    CategoryProductRequest toRequest(CategoryProduct categoryProduct);

}
