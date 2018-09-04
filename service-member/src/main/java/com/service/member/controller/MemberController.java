package com.service.member.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mr.PanYang on 2018/7/31.
 */
@RestController
public class MemberController {

    @Value("${server.port}")
    private String serverPort;
    private static int count = 0;

    @RequestMapping("getUserList")
    public List<String> getUserList() {
        List<String> listUser = new ArrayList<>();
        listUser.add("zhangsan");
        listUser.add("lisi");
        listUser.add("yushengjun");
        listUser.add("端口号：" + serverPort);
        return listUser;
    }

    @RequestMapping("getMemberServiceApi")
    public String getMemberServiceApi() {
        return "this is Member project";
    }

    @RequestMapping("getMemberAll")
    public List<String> getMemberAll() {
        //睡眠3秒
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        count++;
        List<String> listUser = new ArrayList<>();
        listUser.add("zhangsan");
        listUser.add("lisi");
        listUser.add("yushengjun");
        listUser.add("端口号：" + serverPort);
        listUser.add("请求次数：" + count);
        return listUser;
    }

}
