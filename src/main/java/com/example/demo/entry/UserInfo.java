package com.example.demo.entry;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * 人员信息表(UserInfo)实体类
 *
 * @author GuoFeng
 * @since 2021-04-01 15:20:41
 */
@Data
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 888874661660621644L;
    /**
     * 主键id
     */
    private BigInteger id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 外号昵称
     */
    private String nickName;
    /**
     * 性别【0:未知 1:男 2:女】
     */
    private String sex;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 悬赏金
     */
    private BigDecimal moneyReward;
    /**
     * 生日【yyyy-mm-dd】
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date birthday;
    /**
     * 联系方式
     */
    private String phoneNum;
    /**
     * 家庭住址
     */
    private String address;
    /**
     * 所属团队id
     */
    private Long groupId;
    /**
     * 是否删除【1:删除 0:未删除】
     */
    private String isDelete;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

}