package com.seata.demo.feign;

import com.seata.demo.model.dto.OrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "seata-order")
public interface OrderFeign {

    @PostMapping(value = "/order/save")
    boolean saveOrder(@RequestBody OrderDTO order);
}
