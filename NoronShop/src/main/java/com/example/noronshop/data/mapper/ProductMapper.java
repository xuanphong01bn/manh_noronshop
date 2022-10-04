package com.example.noronshop.data.mapper;

import com.example.noronshop.data.data.Product;
import com.example.noronshop.data.request.ProductRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toPojo(ProductRequest productRequest);
    ProductRequest toRequest(Product product);
}
