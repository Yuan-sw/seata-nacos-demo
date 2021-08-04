package com.seata.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO implements Serializable {

    /**
     * 订单所属用户id
     */
    private Long userId;

    /**
     * 订单号
     */
    private String orderNumber;

    /**
     * 订单备注
     */
    private String remark;

    /**
     * 下单时间，时间戳
     */
    private LocalDateTime createTime;
}
