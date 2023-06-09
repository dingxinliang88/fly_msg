package com.juzi.flymsg.mapper;

import com.juzi.flymsg.model.entity.UserLoginInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author codejuzi
 * @description 针对表【userLoginInfo(用户登录信息表)】的数据库操作Mapper
 * @createDate 2023-04-02 20:28:12
 * @Entity com.juzi.flymsg.model.entity.UserLoginInfo
 */
@Mapper
public interface UserLoginInfoMapper extends BaseMapper<UserLoginInfo> {

    /**
     * 根据userAccount判断账号是否存在
     *
     * @param userAccount 用户账号
     * @return 用户登录表中的信息
     */
    UserLoginInfo isExist(String userAccount);

    /**
     * 修改用户登录信息表中的密码
     *
     * @param userId 要修改密码的用户id
     * @param userPassword 加密后的密码
     * @return true - 修改成功
     */
    boolean updateUserPasswordBoolean(long userId, String userPassword);
}




