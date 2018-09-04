package com.service.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Mr.PanYang on 2018/8/1.
 */

@Service
public class OrderMemberService {

    @Autowired
    RestTemplate restTemplate;

    public List<String> getOrderByUserList() {
        return restTemplate.getForObject("http://service-member/getUserList", List.class);
    }
}
