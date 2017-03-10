package com.haro.iot.weixin.tools.controller;

import com.haro.iot.weixin.core.pojo.VEInfo;
import com.haro.iot.weixin.core.service.DeviceInfoService;
import com.haro.iot.weixin.util.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static sun.audio.AudioDevice.device;

/**
 * @Title:
 * @Description:机器信息
 * @Author 单雨连
 * @E-mail shanyulian@aliyun.com
 * @Date 2017/3/9 上午9:24
 * @Version V1.0
 */
@Controller
@RequestMapping("/device")
public class DeviceController {
    @Autowired
    private DeviceInfoService deviceInfoService;//机器信息
    private  VEInfo veInfo;

    public VEInfo getVeInfo() {
        return veInfo;
    }

    public void setVeInfo(VEInfo veInfo) {
        this.veInfo = veInfo;
    }

    // @GetMapping(produces = "text/plain;charset=utf-8")d
    @GetMapping
   @ResponseBody
    @RequestMapping("/query")
    public
    Object authGet(@RequestParam(name = "dtu", required = false) String dtu) {
        if (dtu != null) {
            if (dtu.length()==4) {
                 veInfo = deviceInfoService.selectByDtu(dtu);
                if (veInfo != null) {
                   // if("正常".equals(veInfo.getBjzt()) && "在线".equals(veInfo.getZt())){
                       return veInfo;

                   // }
                }
            }

        }
       Error error = new Error("404","error");
        return error;
    }
}
