package com.example.noronshop.service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();

    T findById(int id);

    T save (T t);

    T update(int id,T t);

    T remove (int id);

}
