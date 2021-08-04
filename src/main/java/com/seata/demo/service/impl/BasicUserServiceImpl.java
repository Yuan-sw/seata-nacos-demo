package com.seata.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seata.demo.feign.OrderFeign;
import com.seata.demo.mapper.BasicUserMapper;
import com.seata.demo.model.dto.OrderDTO;
import com.seata.demo.pojo.BasicUser;
import com.seata.demo.service.BasicUserService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 基础用户表 服务实现类
 * </p>
 *
 * @author ysw
 * @since 2021-08-03
 */
@Service
public class BasicUserServiceImpl extends ServiceImpl<BasicUserMapper, BasicUser> implements BasicUserService {

    @Autowired
    private BasicUserMapper basicUserMapper;

    @Autowired
    private OrderFeign orderFeign;

    @Override
    @GlobalTransactional
    @Transactional(rollbackFor = Exception.class)
    public boolean createOrder() {
        BasicUser basicUser = basicUserMapper.selectById(1L);
        basicUser.setOrderNum(basicUser.getOrderNum() + 1);
        basicUserMapper.updateById(basicUser);
        OrderDTO orderDTO = OrderDTO.builder().userId(basicUser.getId()).orderNumber("ztx_1010000").remark("第一个单子").build();
        orderFeign.saveOrder(orderDTO);
        if (basicUser.getOrderNum() >= 10) {
            throw new RuntimeException("每个人最多下10单");
        }
        return false;
    }
}
