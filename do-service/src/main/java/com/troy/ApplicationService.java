package com.troy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ApplicationService {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ApplicationService.class);
        Map<String,Object> map = new HashMap<String, Object>();
        //这里的目的是加入相关配置
        map.put("spring.profiles.default","service,dao");
        application.setDefaultProperties(map);
        application.run(args);
    }
}
