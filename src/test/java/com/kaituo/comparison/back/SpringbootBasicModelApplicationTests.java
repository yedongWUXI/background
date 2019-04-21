package com.kaituo.comparison.back;

import com.kaituo.comparison.back.core.config.configcenter.ConfigResource;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@RestController
@SpringBootTest
public class SpringbootBasicModelApplicationTests {

    @Resource
    ConfigResource configResource;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBasicModelApplicationTests.class, args);
    }

    //测试配置、热加载
    @RequestMapping("test")
    public String test(){
        return configResource.redisIp+configResource.redisPort;
    }

    //测试是否通
    @RequestMapping("test1")
    public String test1(){
        return "success";
    }

}
