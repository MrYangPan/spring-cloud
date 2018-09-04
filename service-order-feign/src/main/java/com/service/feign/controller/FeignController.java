package com.service.feign.controller;

import com.service.feign.service.IMemberFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Mr.PanYang on 2018/8/1.
 */
@RestController
public class FeignController {

    @Autowired
    private IMemberFeign iMemberFeign;

    @RequestMapping("getFeignAllUserList")
    public List<String> getFeignAllUserList() {
        return iMemberFeign.getOrderByUserList();
    }

    /**
     * @Author: My.PanYang
     * @Description: 测试雪崩效应
     * @Date: 15:12 2018/8/3
     */
    @RequestMapping("getFeignMemberAll")
    public List<String> getFeignMemberAll() {
        return iMemberFeign.getMemberAll();
    }

}
