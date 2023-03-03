package com.example.orderservice.bean;

import java.io.Serializable;

public class Ticker implements Serializable {
    private int id;
    private String userName;
    private int storeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public Ticker() {
    }

    public Ticker(int id, String userName, int storeId) {
        this.id = id;
        this.userName = userName;
        this.storeId = storeId;
    }
}
