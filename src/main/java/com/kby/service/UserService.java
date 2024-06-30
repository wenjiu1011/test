package com.kby.service;

import com.kby.entity.MyResult;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/4/26 16:51
 */
public interface UserService {
//
//    /**
//     * 登录
//     *
//     * @param username
//     * @return
//     */
//    Boolean queryUserByName(String username, String password);

    /**
     * 登录
     *
     * @param uname
     * @param upwd
     * @return
     */
    MyResult queryUser(String uname, String upwd);
}
