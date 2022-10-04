package com.example.noronshop.controller;

import com.example.noronshop.data.request.CategoryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.noronshop.service.IService;
import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private IService<CategoryRequest> CategoryService;

    @PostMapping("/category")
    public ResponseEntity<CategoryRequest> createCategory(@RequestBody CategoryRequest CategoryRequest) {
        return new ResponseEntity<CategoryRequest>(CategoryService.save(CategoryRequest), HttpStatus.OK);
    }

    @GetMapping("/category")
    public ResponseEntity<List<CategoryRequest>> getAllCategory() {
        return new ResponseEntity<>(CategoryService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<CategoryRequest> getCategory(@PathVariable int id) {
        return  new ResponseEntity<>(CategoryService.findById(id),HttpStatus.OK);
    }

    @DeleteMapping("/category/{id}")
    public  ResponseEntity<CategoryRequest> deleteCategory(@PathVariable int id){
        return  new ResponseEntity<>(CategoryService.remove(id),HttpStatus.OK);
    }

    @PutMapping("/category/{id}")
    public ResponseEntity<CategoryRequest> uppdateCategory(@PathVariable int id, @RequestBody CategoryRequest CategoryRequest) {
        return new ResponseEntity<CategoryRequest>(CategoryService.save(CategoryRequest), HttpStatus.OK);

    }
}
