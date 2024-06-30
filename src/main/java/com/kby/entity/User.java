package com.kby.entity;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/4/26 16:49
 */
public class User {

    private Integer uid;
    private String name;

    private String uname;

    private String upwd;


    public User() {
    }

    public User(Integer uid, String name, String uname, String upwd) {
        this.uid = uid;
        this.name = name;
        this.uname = uname;
        this.upwd = upwd;
    }

    /**
     * 获取
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * 设置
     * @param uname
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * 获取
     * @return upwd
     */
    public String getUpwd() {
        return upwd;
    }

    /**
     * 设置
     * @param upwd
     */
    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String toString() {
        return "User{uid = " + uid + ", name = " + name + ", uname = " + uname + ", upwd = " + upwd + "}";
    }
}
