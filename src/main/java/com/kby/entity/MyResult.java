package com.kby.entity;

public class MyResult {
    private String result;
    private String data;

    public MyResult() {
    }

    public MyResult(String result, String data) {
        this.result = result;
        this.data = data;
    }

    /**
     * 获取
     * @return result
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 获取
     * @return data
     */
    public String getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(String data) {
        this.data = data;
    }

    public String toString() {
        return "result{result = " + result + ", data = " + data + "}";
    }
}
