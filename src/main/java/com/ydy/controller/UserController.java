package com.ydy.controller;

import com.alibaba.fastjson.JSON;
import com.ydy.bean.Order;
import com.ydy.bean.User;
import com.ydy.service.OrderService;
import com.ydy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * @author ydy
 * Create By ydy on 2018/6/29
 */
@RestController
@RequestMapping("/user")
public class UserController{
    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;

    /**
     * 保存
     * @param user
     * @return
     */
    @GetMapping()
    public String saveUser(User user){
        userService.save(user);
        return user.toString();
    }

    /**
     * 按id查找
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public String findUser(@PathVariable("id") final String id){
        System.out.println(id);
//        User user = userService.findOne(id);
        User user = new User();
        user.setAge("dadad");
        user.setName("dadw");
        userService.save(user);

        UUID uuid = UUID.randomUUID();
        Order order = new Order();
        order.setId(uuid.toString());
        order.setName("我是测试");
        orderService.save(order);
        System.out.println(user.getName());
        return user.toString();
    }

    /**
     * 查找所有
     * @return
     */
    @GetMapping()
    public String findUserAll(){
        List<User> userList = userService.findAll();
        return JSON.toJSONString(userList);
    }

    /**
     * 更新年龄
     * @param id
     * @param age
     * @return
     */
    @PutMapping("/{id}")
    public String updateAge(@PathVariable("id") String id,@RequestParam("age") int age){
        return userService.modifyAgeById(age,id)+"";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id){
        userService.delete(id);
        return "删除成功！";
    }
}
