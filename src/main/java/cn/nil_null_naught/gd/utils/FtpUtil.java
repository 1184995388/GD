package cn.nil_null_naught.gd.utils;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.IOException;
import java.io.InputStream;

public class FtpUtil {

    //ftp服务器ip地址
    private static String FTP_ADDRESS = "47.100.76.111";
    //端口号
    private static final int FTP_PORT = 21;
    //用户名
    private static String FTP_USERNAME = "ftptest";
    //密码
    private static String FTP_PASSWORD = "123123123";
    //附件路径
    private static String FTP_BASEPATH = "/home/ftptest";

    public static boolean uploadFile(String fileName, InputStream input) {
        boolean success = false;
        FTPClient ftp = new FTPClient();
        try {
            int reply;
            ftp.connect(FTP_ADDRESS, FTP_PORT);//连接FTP服务器
            System.out.println("连接服务器成功");
            ftp.login(FTP_USERNAME, FTP_PASSWORD);//登录
            System.out.println("登入成功");
            reply = ftp.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                System.out.println("链接不活跃");
                ftp.disconnect();
                return false;
            }
            ftp.setControlEncoding("UTF-8");
            ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
            System.out.println("设置文件类型为二进制类型，成功");
            ftp.makeDirectory(FTP_BASEPATH);
            System.out.println("创建文件夹，成功");
            ftp.changeWorkingDirectory(FTP_BASEPATH);
            System.out.println("改变目录，成功");
           // ftp.enterLocalPassiveMode();
            ftp.storeFile(new String(fileName.getBytes("UTF-8"),"iso-8859-1"), input);
            System.out.println("存储文件，成功");
            input.close();
            ftp.logout();
            success = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
        return success;
    }


}
