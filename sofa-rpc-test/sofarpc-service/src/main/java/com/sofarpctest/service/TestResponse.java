package com.sofarpctest.service;

import java.io.Serializable;

/**
 * @Author: Bojun Ji
 * @Description:
 * @Date: 2018/12/9_7:14 PM
 */
public class TestResponse implements Serializable {
    private int code;
    private String msg;

    public TestResponse(String msg) {
        this.code = 1;
        this.msg = msg;
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
