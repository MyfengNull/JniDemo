package com.jnidemo;

/**
 * Created by yangshirong on 2016/10/25 15:33.
 * 邮箱 ysr200808@163.com
 */

public class JniUtils {
    /**
     * 获取应用的签名
     * @param o
     * @return
     */
    public static native String getSignature(Object o);

    /**
     * 获取应用的包名
     * @param o
     * @return
     */
    public static native String getPackname(Object o);

    /**
     * 加载so库或jni库
     */
    static {
        System.loadLibrary("jnidemo");
    }
}
