package com.example.storeservice.mapper;

import com.example.storeservice.bean.Store;
import com.example.storeservice.bean.Ticker;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StoreMapper {
    Store getStore(Ticker ticker);

    void updateStore(Store store);
}
