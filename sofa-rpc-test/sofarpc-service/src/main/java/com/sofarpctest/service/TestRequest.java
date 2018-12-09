package com.sofarpctest.service;

import java.io.Serializable;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/12/9_7:14 PM
 */
public class TestRequest implements Serializable {
    private int code;
    private String msg;

    public TestRequest(int code) {
        this.code = code;
        this.msg = "";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
