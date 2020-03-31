package cn.nil_null_naught.gd.controller;

import cn.nil_null_naught.gd.utils.FtpUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@RestController
public class UploadController {

    @PostMapping("addFile")
    public void addFile(@RequestParam("picture")MultipartFile file) throws IOException {
        //获取上传的文件流
        InputStream inputStream = file.getInputStream();

        //获取上传的文件名
        String filename = file.getOriginalFilename();

        //截取后缀
        String suffix = filename.substring(filename.lastIndexOf("."));

        //使用UUID拼接后缀，定义一个不重复的文件名
        String finalName = UUID.randomUUID()+suffix;

        //调用自定义的FTP工具类上传文件
        boolean flag = FtpUtil.uploadFile(finalName,inputStream);

        System.out.println(flag);
    }

    @GetMapping("test")
    public void test(){
        System.out.println("success");
    }
}
