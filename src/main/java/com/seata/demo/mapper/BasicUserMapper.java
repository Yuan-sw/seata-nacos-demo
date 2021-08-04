package com.seata.demo.mapper;

import com.seata.demo.pojo.BasicUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 基础用户表 Mapper 接口
 * </p>
 *
 * @author ysw
 * @since 2021-08-03
 */
@Repository
public interface BasicUserMapper extends BaseMapper<BasicUser> {

}
