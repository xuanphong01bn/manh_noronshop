package com.example.noronshop.data.mapper;

import com.example.noronshop.data.data.Course;
import com.example.noronshop.data.request.CourseRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseMapper {
    Course toPojo(CourseRequest courseRequest);
    CourseRequest toRequest(Course course);
}
