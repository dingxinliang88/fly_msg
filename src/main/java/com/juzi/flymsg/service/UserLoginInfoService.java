package com.juzi.flymsg.service;

import com.juzi.flymsg.model.dto.user.UserLoginRequest;
import com.juzi.flymsg.model.entity.UserLoginInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author codejuzi
 * @description 针对表【userLoginInfo(用户登录信息表)】的数据库操作Service
 * @createDate 2023-04-02 20:28:12
 */
public interface UserLoginInfoService extends IService<UserLoginInfo> {

    /**
     * 用户登录
     *
     * @param userLoginRequest 用户登录请求对象信息
     * @param request          request 域对象
     * @return 用户id
     */
    Long userLogin(UserLoginRequest userLoginRequest, HttpServletRequest request);

    /**
     * 用户登出
     *
     * @param request request 域对象
     * @return true - 退出成功
     */
    Boolean userLogout(HttpServletRequest request);
}
