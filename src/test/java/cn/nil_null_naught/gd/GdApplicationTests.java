package cn.nil_null_naught.gd;

import cn.nil_null_naught.gd.pojo.User;
import cn.nil_null_naught.gd.service.BackService;
import cn.nil_null_naught.gd.service.impl.BackServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@RunWith(JUnit4.class)
@SpringBootTest
public class GdApplicationTests {

    @Autowired
    public static BackServiceImpl backService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void database(){
        System.out.println(1);
       List<User> list =  backService.queryAll();
        System.out.println("0");
       for(User user:list){
           System.out.println(user);
       }
    }
}
