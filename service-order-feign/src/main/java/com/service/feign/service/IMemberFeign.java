package com.service.feign.service;

import com.service.feign.fallback.MemberFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Mr.PanYang on 2018/8/1.
 */
@FeignClient(value = "service-member", fallback = MemberFallBack.class)
public interface IMemberFeign {

    @RequestMapping("getUserList")
    List<String> getOrderByUserList();

    @RequestMapping("getMemberAll")
    List<String> getMemberAll();
}
