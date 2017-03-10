package com.haro.iot.weixin.core.pojo;

/**
 * Created by shan on 2017/2/16.
 */
public class DeviceInfo {

    private Integer cID;

    private  String spec;

    private Long dID;



    public Integer getcID() {
        return cID;
    }

    public void setcID(Integer cID) {
        this.cID = cID;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public Long getdID() {
        return dID;
    }

    public void setdID(Long dID) {
        this.dID = dID;
    }
}
