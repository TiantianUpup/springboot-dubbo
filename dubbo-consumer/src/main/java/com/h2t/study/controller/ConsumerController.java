package com.h2t.study.controller;

import com.h2t.study.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 消费者控制层
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2020/01/02 15:00
 */
@RestController("/api/consumer")
public class ConsumerController {
    @Resource
    private ConsumerService consumerService;

    @GetMapping
    public Object hello() {
        return consumerService.sayHello();
    }
}
