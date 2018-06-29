package com.ydy.dao;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

/**
 * @author ydy
 * Create By ydy on 2018/6/29
 */
public interface IPublicDao<T>{
    void update(Query query, Update update, Class t);
}
