package com.kby.entity;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/4/11 18:47
 */
public class Student {

    private int sid;
    private String sname;
    private String spwd;
    private String birthday;
    private int money;
    private String address;
    private String salary;
    private String gender;


    public Student() {
    }

    public Student(int sid, String sname, String spwd, String birthday, int money, String address, String salary, String gender) {
        this.sid = sid;
        this.sname = sname;
        this.spwd = spwd;
        this.birthday = birthday;
        this.money = money;
        this.address = address;
        this.salary = salary;
        this.gender = gender;
    }

    /**
     * 获取
     * @return sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * 设置
     * @param sid
     */
    public void setSid(int sid) {
        this.sid = sid;
    }

    /**
     * 获取
     * @return sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * 设置
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * 获取
     * @return spwd
     */
    public String getSpwd() {
        return spwd;
    }

    /**
     * 设置
     * @param spwd
     */
    public void setSpwd(String spwd) {
        this.spwd = spwd;
    }

    /**
     * 获取
     * @return birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置
     * @param birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取
     * @return money
     */
    public int getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(int money) {
        this.money = money;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取
     * @return salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(String salary) {
        this.salary = salary;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Student{sid = " + sid + ", sname = " + sname + ", spwd = " + spwd + ", birthday = " + birthday + ", money = " + money + ", address = " + address + ", salary = " + salary + ", gender = " + gender + "}";
    }
}
