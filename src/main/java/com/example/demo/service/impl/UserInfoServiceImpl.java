package com.example.demo.service.impl;

import com.example.demo.common.Result;
import com.example.demo.dao.UserInfoDao;
import com.example.demo.entry.UserInfo;
import com.example.demo.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/**
 * 人员信息表(UserInfo)表服务实现类
 *
 * @author GuoFeng
 * @since 2021-04-01 15:20:44
 */
@Slf4j
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Map queryById(BigInteger id) {
        Map<String, Object> successMap = Result.getSuccessMap();
        UserInfo userInfo = this.userInfoDao.queryById(id);
        successMap.put("date", userInfo);
        log.info("<====通过主键查询单条数据:" + successMap);
        return successMap;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<UserInfo> queryAllByLimit(int offset, int limit) {
        return this.userInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UserInfo insert(UserInfo userInfo) {
        this.userInfoDao.insert(userInfo);
        return userInfo;
    }

    /**
     * 修改数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UserInfo update(UserInfo userInfo) {
        this.userInfoDao.update(userInfo);
        return this.userInfoDao.queryById(userInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(BigInteger id) {
        return this.userInfoDao.deleteById(id) > 0;
    }
}