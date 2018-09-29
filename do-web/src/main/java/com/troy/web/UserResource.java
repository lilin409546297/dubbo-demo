package com.troy.web;

import com.troy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@Scope("prototype")
public class UserResource {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/findAll")
    public Object findAll() {
        return this.userService.findAll();
    }
}
