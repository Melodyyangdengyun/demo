package com.ydy.bean;

import com.alibaba.fastjson.JSON;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author ydy
 * Create By ydy on 2018/6/29
 */
@Entity
@DynamicUpdate
@DynamicInsert
public class User {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex")
    @Column(name = "id", nullable = false, length = 32, unique = true)
    private String id;

    private String age;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public User() {
    }

    public User(String age, String name) {
        this.age = age;
        this.name = name;
    }
}
