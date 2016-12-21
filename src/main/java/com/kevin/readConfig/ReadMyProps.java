package com.kevin.readConfig;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by kevinWang on 2016/12/21.
 */
@RestController
public class ReadMyProps {

    @Resource
    private MyProps myProps;

    @RequestMapping("/JsonProcessingException")
    public String propsTest() throws JsonProcessingException {

        System.out.println(myProps);

        return myProps.getSimpleProp();

    }
}
