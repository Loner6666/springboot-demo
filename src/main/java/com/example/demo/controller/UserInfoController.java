package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Map;

/**
 * 人员信息表(UserInfo)表控制层
 *
 * @author GuoFeng
 * @since 2021-04-01 15:20:44
 */
@Slf4j
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
    /**
     * 服务对象
     */
    @Autowired
    private UserInfoService userInfoService;

    /**
     * 通过主键查询单条数据
     * URL: /userInfo/selectOne
     * http://localhost:8888/demo/userInfo/selectOne?id=1
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public Map selectOne(BigInteger id) {
        log.info("====>通过主键查询单条数据:" + id);
        try {
            return this.userInfoService.queryById(id);
        } catch (Exception e) {
            log.error("<====>通过主键查询单条数据异常");
            e.printStackTrace();
            return Result.getFailMap();
        }
    }

}