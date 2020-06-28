package com.usthe.bootshiro.util;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * description Jasypt对配置文件加密测试
 *
 * @author wangchangsheng
 * @date 2020/5/29 7:23 AM
 */
public class TestUtil {

    // 将数据库的用户名和密码进行加密
    public static void contextLoads() {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        // 加密所需的salt
        textEncryptor.setPassword("e!swhdg&d763jo");
        // 要加密的数据（数据库的用户名或密码）
        String username = textEncryptor.encrypt("root");
        String password = textEncryptor.encrypt("ch@ngsheng");
        System.out.println("username:" + username);
        System.out.println("password:" + password);
    }

    public static void main(String[] args) {
        TestUtil.contextLoads();
    }
}
