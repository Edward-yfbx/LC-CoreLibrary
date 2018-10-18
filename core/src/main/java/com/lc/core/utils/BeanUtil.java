package com.lc.core.utils;


import com.lc.core.bean.ReviewBean;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Administrator on 2018/7/5.
 */

public class BeanUtil {

    public BeanUtil() {
    }

    private static BeanUtil beanUtil;

    public static BeanUtil getInstance() {
        if (null == beanUtil) {
            synchronized (BeanUtil.class) {
                beanUtil = new BeanUtil();
            }
        }

        return beanUtil;
    }

    // 将User对象序列化，得到一个String字符串，以便保存在sp；
    public String serializeUser(ReviewBean clazz) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                byteArrayOutputStream);
        objectOutputStream.writeObject(clazz);
        String serStr = byteArrayOutputStream.toString("ISO-8859-1");
        serStr = java.net.URLEncoder.encode(serStr, "UTF-8");
        objectOutputStream.close();
        byteArrayOutputStream.close();
        return serStr;
    }

    // 将一个字符串反序列化得到一个User对象
    public ReviewBean deSerialization(String str) throws IOException,
            ClassNotFoundException, NullPointerException {
        String redStr = java.net.URLDecoder.decode(str, "UTF-8");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
                redStr.getBytes("ISO-8859-1"));
        ObjectInputStream objectInputStream = new ObjectInputStream(
                byteArrayInputStream);
        ReviewBean user = (ReviewBean) objectInputStream.readObject();
        objectInputStream.close();
        byteArrayInputStream.close();
        return user;
    }
}
