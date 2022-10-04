package com.example.noronshop.repository;

import NoronShop.jooq.data.tables.records.AdviseRecord;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@SuppressWarnings("rawtypes")
public abstract class AbsCrudRepo<R extends UpdatableRecord<R>, ID, T extends Record> {
    @Autowired
    DSLContext dslContext;

    abstract Table<T> table();

    abstract R getRecord();

    public Field<ID> idField;

    public Class<T> tClass;

    @PostConstruct
    public void init() {
        this.tClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];

        this.idField = (Field<ID>) Arrays.stream(table().fields())
                .filter(field -> field.getName().equals("id"))
                .findFirst()
                .orElse(null);
    }

    public T getById(ID id) {
        return dslContext.selectFrom(table()).where(idField.eq(id)).fetchOneInto(tClass);
    }

    public List<T> findAll() {
        return dslContext.selectFrom(table()).fetchInto(tClass);
    }

    public void save(T t) {
        dslContext.insertInto(table()).set(dslContext.newRecord(table(), t)).execute();
    }

    public void deleteById(ID id) {
        dslContext.delete(table()).where(idField.eq(id)).execute();
    }

    public void update(ID id, T pojo) {
        dslContext.update(table())
                .set(toUpdateQuery(pojo))
                .where(idField.eq(id))
                .execute();
    }

    private Map<Field<?>, Object> toUpdateQuery(T pojo) {
        R record = getRecord();
        record.from(pojo);
        Map<Field<?>, Object> hashMap = new HashMap<>();
        Field<?>[] fields = pojo.fields();
        Arrays.stream(fields)
                .filter(field -> record.get(field) != null)
                .forEach(field -> hashMap.put(field,record.get(field)));
        return hashMap;
    }
}
