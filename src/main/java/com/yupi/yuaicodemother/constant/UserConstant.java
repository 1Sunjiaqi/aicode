package com.yupi.yuaicodemother.constant;

public interface UserConstant {

    /**
     * 用户登录态键
     * 用于标识用户登录状态的键名，在系统中用于存储和验证用户的登录信息
     */
    String USER_LOGIN_STATE = "user_login";

    //  region 权限

    // 权限相关常量定义区域，包含系统中的各种角色定义
    /**
     * 默认角色
     * 系统中普通用户的默认角色标识，具有基本的系统操作权限
     */
    String DEFAULT_ROLE = "user";

    /**
     * 管理员角色
     * 系统管理员的角色标识，拥有系统的最高权限
     */
    String ADMIN_ROLE = "admin";
    
    // endregion
}
