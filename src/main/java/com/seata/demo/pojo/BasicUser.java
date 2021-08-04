package com.seata.demo.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 基础用户表
 * </p>
 *
 * @author ysw
 * @since 2021-08-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BasicUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 已下单数量
     */
    private Integer orderNum;

    /**
     * 注册时间
     */
    private Date createTime;


}
