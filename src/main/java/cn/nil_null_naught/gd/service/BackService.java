package cn.nil_null_naught.gd.service;

import cn.nil_null_naught.gd.pojo.User;

import java.util.List;

public interface BackService {
    int deleteUser(User user);
    List<User> queryAll();
}
