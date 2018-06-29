package com.ydy.service;

import com.ydy.bean.Order;
import com.ydy.dao.IPublicDao;
import com.ydy.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ydy
 * Create By ydy on 2018/6/29
 */
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private IPublicDao<Order> publicDao;
    public void save(Order order) {
        orderRepository.save(order);
    }

    public Order findOne(String id) {
        Optional<Order> byId = orderRepository.findById(id);
        return byId.get();
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public int updateNameById(String id, String name) {
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = Update.update("name",name);
        publicDao.update(query,update,Order.class);
        return 1;
    }

    public void deleteById(String id) {
        orderRepository.deleteById(id);
    }
}
