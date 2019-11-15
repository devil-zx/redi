package com.asjy.redi.controller;



import com.asjy.redi.model.UserEntity;
import com.asjy.redi.service.TestSe;
import com.asjy.redi.until.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @program: springbootdemo
 * @Date: 2019/1/25 15:03
 * @Author: Mr.Zheng
 * @Description:
 */
@Slf4j
@RequestMapping("/redis")
@RestController
public class TestRedis {

    private static int ExpireTime = 60;   // redis中存储的过期时间60s

    @Resource
    private RedisUtil redisUtil;


    @Resource
    private TestSe testSe;

    @RequestMapping("set")
    public boolean redisset(String key, String value){
        UserEntity userEntity =new UserEntity();
        userEntity.setId(Long.valueOf(1));
        userEntity.setGuid(String.valueOf(1));
        userEntity.setName("zhangsan");
        userEntity.setAge(String.valueOf(20));
        userEntity.setCreateTime(new Date());

        //return redisUtil.set(key,userEntity,ExpireTime);

        return redisUtil.set(key,value);
    }

    @RequestMapping("get")
    public Object redisget(String key){
        return redisUtil.get(key);
    }

    @RequestMapping("expire")
    public boolean expire(String key){
        return redisUtil.expire(key,ExpireTime);
    }

    @RequestMapping("getRed")
    public Object getRed(String id){
        System.out.println(redisUtil.get(id));
        System.out.println("哈哈哈哈哈哈111");
        return redisUtil.get(id);
    }
}
