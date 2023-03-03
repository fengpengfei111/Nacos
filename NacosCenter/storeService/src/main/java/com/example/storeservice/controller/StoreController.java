package com.example.storeservice.controller;

import com.example.storeservice.bean.CommonResponse;
import com.example.storeservice.bean.Ticker;
import com.example.storeservice.service.StoreService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.java.Log;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
@Log
public class StoreController {
    @Autowired
    StoreService storeService;

    @PostMapping("/getStore")
    public CommonResponse getStore(@RequestBody Ticker ticker){
        CommonResponse commonResponse = new CommonResponse(true);
        storeService.getStore(ticker);
        log.info("扣减库存成功");
        return commonResponse;
    }

}
