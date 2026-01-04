package com.yupi.yuaicodemother.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.yupi.yuaicodemother.model.dto.UserQueryRequest;
import com.yupi.yuaicodemother.model.entity.User;
import com.yupi.yuaicodemother.model.vo.LoginUserVO;
import com.yupi.yuaicodemother.model.vo.UserVO;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;


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

    // 返回脱敏之后的用户信息——指用户之间能够互相查看到的信息
    public UserVO getUserVO(User user);

    // 返回脱敏之后的用户信息列表——指用户之间能够互相查看到的信息
    public List<UserVO> getUserVOList(List<User> userList);

    // 根据查询条件构造查询参数
    QueryWrapper getQueryWrapper(UserQueryRequest userQueryRequest);

    // 获取登录方法
    User getLoginUser(HttpServletRequest request);

    // 用户注销
    boolean userLogout(HttpServletRequest request);

    // 用户登录
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);// 登录成功之后更新 session
}
