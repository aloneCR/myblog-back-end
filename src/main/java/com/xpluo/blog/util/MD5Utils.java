package com.xpluo.blog.util;

import org.springframework.util.DigestUtils;

public class MD5Utils {

    private static final String SALT = "dxx.xpluo";
    private static final int ENCODE_TIMES = 3;

    public MD5Utils() {
    }

    public static String encode(String code) {
        if (code == null) {
            throw new RuntimeException("MD5Utils: 加密的字符串不能为空!");
        }
        String result = null;
        for (int i = 0; i < ENCODE_TIMES; i++) {
            result = DigestUtils.md5DigestAsHex((SALT + code + SALT).getBytes());
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        String pwd = "123456";
        System.out.println(encode(pwd));
    }
}
