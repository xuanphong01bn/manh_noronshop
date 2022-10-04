package com.example.noronshop.data.mapper;

import com.example.noronshop.data.data.Bill;
import com.example.noronshop.data.request.BillRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BillMapper {
    Bill toPojo(BillRequest billRequest);
    BillRequest toRequest(Bill bill);
}
