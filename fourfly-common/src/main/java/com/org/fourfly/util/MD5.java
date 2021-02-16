package com.org.fourfly.util;

/**
 * @Author Jian
 * @Date 2021/2/16 17:06:04
 * @Description 请简单描述
 * @Version 1.0
 **/
public class MD5 {

    /**
     * MD5加密工具类
     * @param data
     * @return
     */
    public static String MD5(String data) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(data.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte bt : array) {
                sb.append(Integer.toHexString((bt & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString().toUpperCase();
        } catch (Exception ex) {
        }
        return null;
    }
}
