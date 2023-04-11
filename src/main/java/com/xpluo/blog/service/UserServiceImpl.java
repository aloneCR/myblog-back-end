package com.xpluo.blog.service;

import com.xpluo.blog.dao.UserRepository;
import com.xpluo.blog.po.User;
import com.xpluo.blog.util.MD5Utils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.encode(password));
        return user;
    }
}
