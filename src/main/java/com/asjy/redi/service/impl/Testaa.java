package com.asjy.redi.service.impl;

import com.asjy.redi.model.UserEntity;
import com.asjy.redi.service.TestSe;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
public class Testaa implements TestSe {


    @Cacheable(value = "localhost", key = "#id")
    public UserEntity find(String id) {
        return this.find(id);
    }
}
