package com.h2t.study.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.h2t.study.api.ProviderService;

/**
 * 服务提供者接口实现类
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2020/01/02 14:27
 */
@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello() {
        return "Hello World!";
    }
}
