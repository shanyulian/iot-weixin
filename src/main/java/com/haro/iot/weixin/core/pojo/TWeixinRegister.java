package com.haro.iot.weixin.core.pojo;

public class TWeixinRegister {
    private Integer id;

    private String agentName;

    private String number;

    private String mark;

    private String agentId;

    private Integer sendComd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    public Integer getSendComd() {
        return sendComd;
    }

    public void setSendComd(Integer sendComd) {
        this.sendComd = sendComd;
    }
}