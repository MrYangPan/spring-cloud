package com.service.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Mr.PanYang on 2018/8/2.
 */
@Component
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";   // 前置过滤器
    }

    @Override
    public int filterOrder() {
        return 0;   // 优先级为0，数字越大，优先级越低
    }

    @Override
    public boolean shouldFilter() {
        return true;    // 是否执行该过滤器
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if (accessToken != null) {
            return null;
        }
        System.out.println("token is empty");
        ctx.setSendZuulResponse(false);
        ctx.setResponseStatusCode(401);
        try {
            ctx.getResponse().getWriter().write("token is empty");
        } catch (Exception e) {
        }
        return null;
    }
}
