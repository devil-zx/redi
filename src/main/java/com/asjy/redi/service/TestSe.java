package com.asjy.redi.service;

import com.asjy.redi.model.UserEntity;
import org.springframework.cache.annotation.Cacheable;

public interface TestSe {

    UserEntity find(String id);
}
