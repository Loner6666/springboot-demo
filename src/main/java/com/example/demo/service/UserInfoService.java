package com.example.demo.service;

import com.example.demo.entry.UserInfo;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/**
 * 人员信息表(UserInfo)表服务接口
 *
 * @author makejava
 * @since 2021-04-01 15:20:43
 */
public interface UserInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Map queryById(BigInteger id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    UserInfo insert(UserInfo userInfo);

    /**
     * 修改数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    UserInfo update(UserInfo userInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(BigInteger id);

}