package com.troy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("spring.profiles.default","web,dao");
        application.setDefaultProperties(map);
        application.run(args);
    }
}
