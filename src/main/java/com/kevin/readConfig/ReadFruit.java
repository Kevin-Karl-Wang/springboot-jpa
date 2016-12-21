package com.kevin.readConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by kevinWang on 2016/12/21.
 */
@RestController
public class ReadFruit {

    @Value("${fruit.name}")
    private String name;

    @Value("${fruit.amount}")
    private Integer amount;

    @RequestMapping("/testyml")
    public String readymlResource() {
        return name + ";" + amount;
    }

    @Resource
    private Fruit fruit;

    @RequestMapping("/readymlResourceByBean")
    public String readymlResourceByBean() {
        return fruit.getName() + ";" + fruit.getAmount();
    }


}
