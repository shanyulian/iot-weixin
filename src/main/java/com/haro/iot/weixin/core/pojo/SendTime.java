package com.haro.iot.weixin.core.pojo;


import java.sql.Timestamp;

/**
 * @Title:
 * @Description:发送时间查询
 * @Author 单雨连
 * @E-mail shanyulian@aliyun.com
 * @Date 2017/2/19 下午12:20
 * @Version V1.0
 */
public class SendTime {

    private Integer id;

    private String cpsn;

    private Timestamp timestamp;

    private int intervalTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpsn() {
        return cpsn;
    }

    public void setCpsn(String cpsn) {
        this.cpsn = cpsn;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public int getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(int intervalTime) {
        this.intervalTime = intervalTime;
    }
}
