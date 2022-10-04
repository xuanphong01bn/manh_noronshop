package com.example.noronshop.repository;

import com.example.noronshop.data.data.Advise;

import java.util.List;

public interface IAdviseRepository {
        Advise getById(int id);

        List<Advise> findAll();

        void save(Advise advise);

        void deleteById(int id);

        void update(int id, NoronShop.jooq.data.tables.pojos.Advise advise);
}
