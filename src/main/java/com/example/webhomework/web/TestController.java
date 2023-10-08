package com.example.webhomework.web;

import com.example.webhomework.service.gatewy.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RequestMapping("/fun111")
@Controller//这里我们需要让他知道这是一个控制器
public class TestController {

    @Resource
    private TestService testService;


    @RequestMapping("/fun")
    @ResponseBody//因为这里我们返回的是字符串
    public String fun() {
        return testService.getRes();
    }


}
