package cn.nil_null_naught.gd.service.impl;

import cn.nil_null_naught.gd.mapper.UserMapper;
import cn.nil_null_naught.gd.pojo.Menu;
import cn.nil_null_naught.gd.pojo.User;
import cn.nil_null_naught.gd.service.BackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BackServiceImpl")
public class BackServiceImpl implements BackService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteUser(User user){
        return 1;
    }

    @Override
    public List<User> queryAll(){
        System.out.println("2");
        System.out.println(userMapper);
        return userMapper.selectAll();
    }

    public static void main(String[] args) {
        BackServiceImpl backService = new BackServiceImpl();
        List<User> list =  backService.queryAll();
        System.out.println("0");
        for(User user:list){
            System.out.println(user);
        }
    }
}
