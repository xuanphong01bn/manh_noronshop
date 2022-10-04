package com.example.noronshop.service.impl;

import com.example.noronshop.data.data.Advise;
import com.example.noronshop.data.mapper.AdviseMapper;
import com.example.noronshop.data.request.AdviseRequest;
import com.example.noronshop.repository.IAdviseRepository;
import com.example.noronshop.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class AdviseService implements IService<AdviseRequest> {
    @Autowired
    IAdviseRepository adviseRepository;
    @Autowired
    AdviseMapper adviseMapper;

    @Override
    public List<AdviseRequest> findAll() {
        List<Advise> advises = adviseRepository.findAll();
        List<AdviseRequest> adviseRequests = new ArrayList<>();
        for(Advise advise : advises){
            AdviseRequest adviseRequest = adviseMapper.toRequest(advise);
            adviseRequests.add(adviseRequest);
        }
        return adviseRequests;
    }

    @Override
    public AdviseRequest findById(int id) {
        Advise advise = adviseRepository.getById(id);
        AdviseRequest adviseRequest = adviseMapper.toRequest(advise);
        return adviseRequest;
    }

    @Override
    public AdviseRequest save(AdviseRequest adviseRequest) {
        Advise advise = adviseMapper.toPojo(adviseRequest);
        adviseRepository.save(advise);
        return adviseRequest;
    }

    @Override
    public AdviseRequest update(int id, AdviseRequest adviseRequest) {
        Advise advise = adviseMapper.toPojo(adviseRequest);
        adviseRepository.save(advise);
        return adviseRequest;
    }

    @Override
    public AdviseRequest remove(int id) {
        Advise advise = adviseRepository.getById(id);
        AdviseRequest adviseRequest = adviseMapper.toRequest(advise);
        if(adviseRequest == null){
            return  null;
        }
        adviseRepository.deleteById(id);
        return adviseRequest;
    }
}
