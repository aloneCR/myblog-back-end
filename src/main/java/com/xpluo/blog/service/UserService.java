package com.xpluo.blog.service;

import com.xpluo.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
