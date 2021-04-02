package com.example.demo.utils;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;

/**
 * @Description：时间工具类
 * @Author：GuoFeng
 * @CreateTime：2021-04-01
 */
@Slf4j
public class TimeUtil {

    /**
     * 时间戳转年月日时分秒
     *
     * @param timeMillis 时间戳
     * @return 年月日时分秒
     */
    public static String dateFormat(long timeMillis) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = dateFormat.format(timeMillis);
        return now;
    }


}
