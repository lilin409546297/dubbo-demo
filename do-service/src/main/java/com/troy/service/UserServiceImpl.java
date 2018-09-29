package com.troy.service;

import com.troy.domain.User;
import com.troy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service(value = "userService")
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {

        List<User> users = new ArrayList<User>();
        Iterator<User> iterator = this.userRepository.findAll().iterator();
        while (iterator.hasNext()) {
            users.add(iterator.next());
        }
        return users;
    }
}
