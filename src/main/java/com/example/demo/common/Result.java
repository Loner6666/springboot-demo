package com.example.demo.common;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description：默认返回体
 * @Author：GuoFeng
 * @CreateTime：2021-04-01
 */
public class Result {

    /**
     * 操作成功返回体
     *
     * @return code:200 message:操作成功
     */
    public static Map<String, Object> getSuccessMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", "200");
        map.put("message", "操作成功");
        return map;
    }

    /**
     * 操作失败返回体
     *
     * @return code:500 message:操作失败
     */
    public static Map<String, Object> getFailMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", "500");
        map.put("message", "操作失败");
        return map;
    }

}
