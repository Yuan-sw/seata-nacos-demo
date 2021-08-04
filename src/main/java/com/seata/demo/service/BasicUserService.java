package com.seata.demo.service;

import com.seata.demo.pojo.BasicUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 基础用户表 服务类
 * </p>
 *
 * @author ysw
 * @since 2021-08-03
 */
public interface BasicUserService extends IService<BasicUser> {

    boolean createOrder();
}
