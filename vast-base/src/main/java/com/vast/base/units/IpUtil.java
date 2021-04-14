package com.vast.base.units;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ====================================================
 *
 * @ProjectName: vastinbk
 * @Package: com.vast.base.units
 * @ClassName: IpUtil
 * @Author: Administrator
 * @Description:
 * @Date: 2021/4/14 16:50
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public class IpUtil {

    public static void main(String[] args) {
        IpUtil ipUtil = new IpUtil();
        ipUtil.acp();
    }

    public void acp() {
        try {
            //1：创建服务器的套接字
            ServerSocket ss = new ServerSocket(6086);
            //2:监听客户端的套接字,并且返回客户端的套接字
            Socket s = ss.accept();  //阻塞式方法

            System.out.println(s.getInetAddress());
            //3:获取输入流
            InputStream is = s.getInputStream();
            //4:读取数据
            byte[] by = new byte[1024];
            int num = 0;
            while((num = is.read())!=-1){
                System.out.print((char)num);
            }
            //5:关闭套接字
            s.close();
        }catch (Exception e) {
            System.out.println("错误信息" + e.getMessage());
        }

    }
}
