package com.example.orderservice.controller;

import com.example.orderservice.bean.CommonResponse;
import com.example.orderservice.bean.Ticker;
import com.example.orderservice.service.TickerService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RefreshScope
@RestController
@RequestMapping("/order")
@Log
public class TickerController {
    @Autowired
    TickerService tickerService;

    @PostMapping("/create")
    public CommonResponse createOrder(@RequestBody Ticker ticker) {
        CommonResponse commonResponse = new CommonResponse(true);
        try {
            tickerService.createOrder(ticker);
        } catch (Exception exception) {
            log.info("创建订单失败,错误信息:" + exception);
            commonResponse.setSuccess(false);
        }
        return commonResponse;
    }
}
