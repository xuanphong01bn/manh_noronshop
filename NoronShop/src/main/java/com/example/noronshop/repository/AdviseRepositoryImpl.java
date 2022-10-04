package com.example.noronshop.repository;


import NoronShop.jooq.data.tables.records.AdviseRecord;
import com.example.noronshop.data.data.Advise;
import org.jooq.DSLContext;

import org.jooq.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

import static NoronShop.jooq.data.Tables.ADVISE;


@Component
public class AdviseRepositoryImpl extends AbsCrudRepo<AdviseRecord, Integer, Advise> implements IAdviseRepository {

    @Autowired
    private DSLContext dslContext;


    @Override
    public Advise getById(int id) {
        return dslContext.selectFrom(ADVISE)
                .where(ADVISE.ID.eq(id))
                .fetchOneInto(Advise.class);
    }

    @Override
    Table<Advise> table() {
        return ADVISE;
    }

    @Override
    AdviseRecord getRecord() {
        return null;
    }

    @Override
    public List<Advise> findAll() {
        return dslContext.selectFrom(ADVISE)
                .fetchInto(Advise.class);
    }

    @Override
    public void save(Advise advise) {
        dslContext.insertInto(ADVISE)
                .set(dslContext.newRecord(ADVISE, advise))
                .execute();
    }

    @Override
    public void deleteById(int id) {
        dslContext.delete(ADVISE)
                .where(ADVISE.ID.eq(id))
                .execute();
    }

    @Override
    public void update(int id, NoronShop.jooq.data.tables.pojos.Advise advise) {
        dslContext.update(ADVISE)
                .set(ADVISE.ID, 1)
                .set(ADVISE.PRODUCT_ID, 2)
                .set(ADVISE.EXPERTS, "Good")
                .set(ADVISE.TIME, advise.getTime())
                .where(ADVISE.ID.eq(id)).execute();
    }
}
