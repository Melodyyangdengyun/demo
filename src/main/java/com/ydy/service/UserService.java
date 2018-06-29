package com.ydy.service;

import com.ydy.bean.User;
import com.ydy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author ydy
 * Create By ydy on 2018/6/29
 */
@Transactional
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findOne(String id) {
        Optional<User> byId = userRepository.findById(id);
        return byId.get();
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public int modifyAgeById(int age, String id) {
        return userRepository.modifyAgeById(age,id);
    }

    public void delete(String id) {
        userRepository.deleteById(id);
    }

    public void save(User user) {
        userRepository.save(user);
    }
}
