package com.seata.demo.controller;


import com.seata.demo.service.BasicUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 基础用户表 前端控制器
 * </p>
 *
 * @author ysw
 * @since 2021-08-04
 */
@RestController
@RequestMapping("/basic-user")
public class BasicUserController {

    @Autowired
    private BasicUserService basicUserService;

    @GetMapping(value = "/create/order")
    public boolean createOrder() {
        boolean result = basicUserService.createOrder();
        return result;
    }
}
