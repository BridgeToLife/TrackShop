package com.ilya.web.shop.service;

import com.ilya.web.shop.entity.api.Identifible;

import java.util.List;

public interface Service<T extends Identifible> {

    T add(T object);
    void delete(long id);
    T getByName(String name);
    T edit(T object);
    List<T> getAll();
}
