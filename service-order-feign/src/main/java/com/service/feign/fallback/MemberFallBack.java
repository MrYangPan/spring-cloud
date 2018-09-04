package com.service.feign.fallback;

import com.service.feign.service.IMemberFeign;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mr.PanYang on 2018/8/3.
 *
 *
 *
 */
@Component
public class MemberFallBack implements IMemberFeign {
    @Override
    public List<String> getOrderByUserList() {
        List<String> list = new ArrayList<>();
        list.add("系统错误");
        return list;
    }

    @Override
    public List<String> getMemberAll() {
        List<String> list = new ArrayList<>();
        list.add("系统错误");
        return list;
    }
}
