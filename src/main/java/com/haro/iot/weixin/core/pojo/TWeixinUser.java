package com.haro.iot.weixin.core.pojo;

public class TWeixinUser {
    private Integer id;

    private String openid;

    private String agentName;

    private String agentId;

    private Integer queryAuthority;

    private Integer receiveAuthority;

    private String addContent;

    private String nickName;

    private String phone;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    public Integer getQueryAuthority() {
        return queryAuthority;
    }

    public void setQueryAuthority(Integer queryAuthority) {
        this.queryAuthority = queryAuthority;
    }

    public Integer getReceiveAuthority() {
        return receiveAuthority;
    }

    public void setReceiveAuthority(Integer receiveAuthority) {
        this.receiveAuthority = receiveAuthority;
    }

    public String getAddContent() {
        return addContent;
    }

    public void setAddContent(String addContent) {
        this.addContent = addContent == null ? null : addContent.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}