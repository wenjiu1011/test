package com.kby.service.impl;

import com.kby.entity.MyResult;
import com.kby.entity.User;
import com.kby.mapper.UserMapper;
import com.kby.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/4/26 16:52
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 登录
     *
     * @param uname
     * @param upwd
     * @return
     */
    @Override
    public MyResult queryUser(String uname, String upwd) {
        User user = userMapper.queryUser(uname);
        if (user != null && user.getUpwd().equals(upwd)) {
            return new MyResult("success","true");
        }else {
            return new MyResult("false","false");
        }
    }

//    @Resource
//    private UserMapper userMapper;
//
//    /**
//     * 登录
//     *
//     * @param username
//     * @return
//     */
//    @Override
//    public Boolean queryUserByName(String username, String password) {
//        User user = userMapper.queryUserByName(username);
//        if (user != null && password.equals(user.getPassword())) {
//            return true;
//        }
//        return false;
//    }


}
