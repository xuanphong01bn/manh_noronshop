package com.example.noronshop.controller;

import com.example.noronshop.data.request.AdviseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.noronshop.service.IService;

import java.util.List;

@RestController
public class AdviseController {
    @Autowired
    private IService<AdviseRequest> adviseService;

    @PostMapping("/advise")
    public ResponseEntity<AdviseRequest> createAdvise(@RequestBody AdviseRequest adviseRequest) {
        return new ResponseEntity<AdviseRequest>(adviseService.save(adviseRequest), HttpStatus.OK);
    }


    @GetMapping("/advise")
    public ResponseEntity<List<AdviseRequest>> getAllAdvise() {
        return new ResponseEntity<>(adviseService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/asvise/{id}")
    public ResponseEntity<AdviseRequest> getAdvise(@PathVariable int id) {
        return new ResponseEntity<>(adviseService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/advise/{id}")
    public ResponseEntity<AdviseRequest> deleteAdvise(@PathVariable int id) {
        return new ResponseEntity<>(adviseService.remove(id), HttpStatus.OK);
    }

    @PutMapping("/advise/{id}")
    public ResponseEntity<AdviseRequest> uppdateAdvise(@PathVariable int id, @RequestBody AdviseRequest adviseRequest) {
        return new ResponseEntity<AdviseRequest>(adviseService.save(adviseRequest), HttpStatus.OK);

    }
}
