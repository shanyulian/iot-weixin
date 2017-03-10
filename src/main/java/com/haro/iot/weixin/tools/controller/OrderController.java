package com.haro.iot.weixin.tools.controller;

import com.haro.iot.weixin.core.pojo.TMyorder;
import com.haro.iot.weixin.core.pojo.VEInfo;
import com.haro.iot.weixin.core.service.OrderService;
import com.haro.iot.weixin.util.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Title:
 * @Description:查询订单信息
 * @Author 单雨连
 * @E-mail shanyulian@aliyun.com
 * @Date 2017/3/9 下午1:01
 * @Version V1.0
 */
@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @ResponseBody
    @GetMapping(produces = "text/plain;charset=utf-8")
    @RequestMapping("/query")
    public Object authGet(@RequestParam(name = "order", required = false) String order) {
        OrderStatus orderStatus = new OrderStatus();
        orderStatus.setOrder(order);
        int sta = orderService.selectStatusByOuttradeno(order);
        if(sta>0){

            if(sta==1){
                orderStatus.setStatus("success");
                return orderStatus;
            }else  if(sta == 2){
                orderStatus.setStatus("ing");
                return orderStatus;

            }
        }
        orderStatus.setStatus("noOrder");
        return orderStatus;


    }

    //@ResponseBody
    @GetMapping(produces = "text/plain;charset=utf-8")
    @RequestMapping("/updata")
    public void updata(@RequestParam(name = "order", required = false) String order,
                         @RequestParam(name = "device", required = false) String device,
                         @RequestParam(name = "attach", required = false) String attach) {

            if(order!=null && device!=null && attach!=null){
                TMyorder tMyorder =new TMyorder();
                tMyorder.setAttach(attach);
                tMyorder.setDtuname(device);
                tMyorder.setStatus(2);
                tMyorder.setOuttradeno(order);
                Date dt = new Date();
                SimpleDateFormat matter1 = new SimpleDateFormat("yyyy-MM-dd");
                tMyorder.setTimeday(matter1.format(dt));
                orderService.saveOrder(tMyorder);

            }
    }
}
