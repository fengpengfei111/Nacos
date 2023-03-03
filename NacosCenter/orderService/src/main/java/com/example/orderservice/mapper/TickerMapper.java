package com.example.orderservice.mapper;

import com.example.orderservice.bean.Ticker;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface TickerMapper {
    void createOrder(Ticker ticker);
}
