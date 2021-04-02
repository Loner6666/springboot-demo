package com.example.demo.controller;

import com.example.demo.entry.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

/**
 * 人员信息表(UserInfo)表控制层
 *
 * @author GuoFeng
 * @since 2021-04-01 15:20:44
 */
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
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserInfo selectOne(BigInteger id) {
        return this.userInfoService.queryById(id);
    }

}