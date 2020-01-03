package com.h2t.study.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.h2t.study.HelloService;
import com.h2t.study.service.ConsumerService;
import org.springframework.stereotype.Service;

/**
 * 服务消费者实现类
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2020/01/02 14:45
 */
@Service
public class HelloServiceImpl implements ConsumerService {
    @Reference(version = "1.0.0")
    private HelloService helloService;

    @Override
    public String sayHello() {
        return helloService.sayHello();
    }
}
