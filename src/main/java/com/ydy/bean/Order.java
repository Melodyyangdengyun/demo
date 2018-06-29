package com.ydy.bean;

import com.alibaba.fastjson.JSON;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author ydy
 * Create By ydy on 2018/6/29
 */
@Document
public class Order {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

}
