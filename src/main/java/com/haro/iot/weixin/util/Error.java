package com.haro.iot.weixin.util;

/**
 * @Title:
 * @Description:
 * @Author 单雨连
 * @E-mail shanyulian@aliyun.com
 * @Date 2017/3/9 下午3:29
 * @Version V1.0
 */
public class Error {

    private String errcode;
    private String errmsg;

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public Error(String errcode, String errmsg) {
        this.errcode = errcode;
        this.errmsg = errmsg;
    }
}
