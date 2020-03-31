package cn.nil_null_naught.gd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

//扫描mapper 包路径
@MapperScan(basePackages = "cn.nil_null_naught.gd.mapper")
@ComponentScan(basePackages = {"cn.nil_null_naught.gd"})
//扫描 所有需要的包, 包含一些自用的工具类包 所在的路径
@SpringBootApplication
public class GdApplication {

    public static void main(String[] args) {
        SpringApplication.run(GdApplication.class, args);
    }

}
