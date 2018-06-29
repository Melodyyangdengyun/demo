package com.ydy.repository;

import com.ydy.bean.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ydy
 * Create By ydy on 2018/6/29
 */
@Repository
public interface OrderRepository extends MongoRepository<Order,String> {
}
