package com.usthe.bootshiro.util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * description javaDemo
 *
 * @author wangchangsheng
 * @date 2020/6/12 7:26 AM
 */
public class MyUtil {
    public static void functionDemo_4() {

        String str = "da jia hao,ming tian bu fang jia!";
        String regex = "\\b[a-z]{3}\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        //查找。 find();
        System.out.println(str);
        while (m.find()) {
            System.out.println(m.group());//获取匹配的子序列
            System.out.println(m.start() + ":" + m.end());
        }
    }
    /*
     * 替换
     */

    public static void functionDemo_3() {
        String str = "zhangsanttttxiaoqiangmmmmmmzhaoliu";
        str = str.replaceAll("(.)\\1+", "$1");
        System.out.println(str);
        String tel = "15800001111";//158****1111;
        tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        System.out.println(tel);
    }

    /*
     * 切割。
     * 组：((A)(B(C)))
     */

    public static void functionDemo_2() {

        String str = "zhangsanttttxiaoqiangmmmmmmzhaoliu";
        String[] names = str.split("(.)\\1+");//str.split("\\.");
        for (String name : names) {
            System.out.println(name);
        }
        /*
         * 演示匹配。
         */
    }

    public static void functionDemo_1() {

        //匹配手机号码是否正确。

        String tel = "15800001111";

        String regex = "1[358]\\d{9}";

        boolean b = tel.matches(regex);

        System.out.println(tel + ":" + b);

    }

    public static void testSystem() {
        long l = System.currentTimeMillis();
        System.out.println(l);
        System.out.println(System.getProperties());
    }

    public static void main(String[] args) throws IOException {
        String[] availableIDs = TimeZone.getAvailableIDs();
        TimeZone aDefault = TimeZone.getDefault();
        System.out.println("default:" + aDefault);

        String displayName = aDefault.getDisplayName();
        System.out.println("displayName:" + displayName);
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Shanghai");
    }
}
