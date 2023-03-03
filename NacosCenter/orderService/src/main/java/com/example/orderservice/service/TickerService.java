package com.example.orderservice.service;

import com.example.orderservice.bean.CommonResponse;
import com.example.orderservice.bean.Ticker;
import com.example.orderservice.mapper.TickerMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class TickerService {
    @Autowired
    TickerMapper tickerMapper;

    @Autowired
    StoreClient storeClient;
    @GlobalTransactional(name = "order",rollbackFor = Exception.class)
    public void createOrder(Ticker ticker) {
        tickerMapper.createOrder(ticker);
        storeClient.getStore(ticker);
    }
}
