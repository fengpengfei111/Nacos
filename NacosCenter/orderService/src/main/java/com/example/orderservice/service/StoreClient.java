package com.example.orderservice.service;


import com.example.orderservice.bean.Ticker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(name = "store-service")
public interface StoreClient {
    @PostMapping("store/getStore")
    void getStore(Ticker ticker);
}
