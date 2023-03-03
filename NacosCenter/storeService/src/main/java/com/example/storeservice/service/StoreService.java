package com.example.storeservice.service;

import com.example.storeservice.bean.Store;
import com.example.storeservice.bean.Ticker;
import com.example.storeservice.mapper.StoreMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
    @Autowired
    StoreMapper storeMapper;
    public void getStore(Ticker ticker)  {
        Store store = storeMapper.getStore(ticker);
        if (store.getCount()>0){
            store.setCount(store.getCount()-1);
            storeMapper.updateStore(store);
        }else {
            throw new RuntimeException();
        }
    }

}
