package com.example.noronshop.data.mapper;

import com.example.noronshop.data.data.Book;
import com.example.noronshop.data.request.BookRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book toPojo(BookRequest bookRequest);
    BookRequest toRequest(Book book);
}
