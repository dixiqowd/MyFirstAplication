package com.example.webhomework.service.impl;

import com.example.webhomework.domain.StudentDomainService;
import com.example.webhomework.service.gatewy.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class TestServiceImpl implements TestService {

    @Resource
    private StudentDomainService studentDomainService;


    @Override //注解：用于标识方法是重写父类中的方法
    public String getRes() {
        String name = studentDomainService.getStudentName();

        //处理具体的业务逻辑，比如排序等

        return name + "是猪";
    }



}
