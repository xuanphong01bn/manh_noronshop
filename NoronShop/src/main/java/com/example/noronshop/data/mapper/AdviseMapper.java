package com.example.noronshop.data.mapper;

import com.example.noronshop.data.data.Advise;
import com.example.noronshop.data.request.AdviseRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdviseMapper {
    Advise toPojo (AdviseRequest adviseRequest);
    AdviseRequest toRequest (Advise advise);
}
