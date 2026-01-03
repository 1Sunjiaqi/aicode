package com.yupi.yuaicodemother.service;

import com.mybatisflex.core.service.IService;
import com.yupi.yuaicodemother.model.entity.User;
import com.yupi.yuaicodemother.model.vo.LoginUserVO;
import jakarta.servlet.http.HttpServletRequest;

/**
 * 用户 服务层。
 *
 * @author sjq
 */
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);// 返回用户id

    String getEncryptPassword(String userPassword);

    // 用来返回给前端脱敏之后的用户 VO
    LoginUserVO getLoginUserVO(User user);

    // 用户登录
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);// 登录成功之后更新 session
}
