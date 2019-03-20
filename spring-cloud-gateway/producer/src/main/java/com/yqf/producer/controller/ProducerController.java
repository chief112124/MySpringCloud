package com.yqf.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :
 * @Author : Yangqinfeng
 * @Date : 2019/3/19
 */
@RestController
public class ProducerController {

    @GetMapping("/hello")
    public Object hello() {
        return "hello world this is :" +this.getClass().getName();
    }


}
