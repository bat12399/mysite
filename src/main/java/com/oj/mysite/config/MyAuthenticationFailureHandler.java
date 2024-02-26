package com.oj.mysite.config;

import com.alibaba.fastjson2.JSON;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import java.io.IOException;
import java.util.HashMap;

public class MyAuthenticationFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {

        String message = exception.getMessage();

        HashMap result = new HashMap();
        result.put("code", 400);
        result.put("msg", "登录失败");
        result.put("data", message);

        String json = JSON.toJSONString(result);

        response.setContentType("application/json;charset=utf-8");
        response.getWriter().println(json);
    }
}
