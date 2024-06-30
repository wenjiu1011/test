package com.kby.mapper;

import com.kby.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/4/26 16:49
 */
public interface UserMapper {

//    /**
//     * 通过用户名查询用户
//     *
//     * @param username
//     * @return
//     */
//    User queryUserByName(@Param("username") String username);

    /**
     * 通过用户名查找用户
     * @param uname
     * @return
     */
    User queryUser(@Param("uname") String uname);

}
