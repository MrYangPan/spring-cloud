package com.service.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.service.order.service.OrderMemberService;

import java.util.List;

/**
 * Created by Mr.PanYang on 2018/8/1.
 */
@RestController
public class OrderController {

    @Autowired
    private OrderMemberService orderMemberService;

    @RequestMapping("getOrderUserAll")
    public List<String> getOrderUserAll() {
        System.out.println("订单服务开始调用会员服务");
        return orderMemberService.getOrderByUserList();
    }

    @RequestMapping("getOrderServiceApi")
    public String getOrderServiceApi() {
        return "this is Order project";
    }

}
