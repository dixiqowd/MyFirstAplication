package com.example.webhomework.domain;

import com.example.webhomework.mapper.StudentMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class StudentDomainService {
    @Resource
    private StudentMapper studentMapper;

    public String getStudentName(){

        return "刘小倩";
        //因为我这里没安装mysql,没有配置mysql 相关内容，
        //return studentMapper.getName();
    }


}
