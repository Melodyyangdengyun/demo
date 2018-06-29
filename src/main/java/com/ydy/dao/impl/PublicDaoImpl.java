package com.ydy.dao.impl;

import com.ydy.dao.IPublicDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

/**
 * @author ydy
 * Create By ydy on 2018/6/29
 */
@Repository
public class PublicDaoImpl implements IPublicDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void update(Query query, Update update, Class t) {
        mongoTemplate.updateMulti(query,update,t);
    }
}
