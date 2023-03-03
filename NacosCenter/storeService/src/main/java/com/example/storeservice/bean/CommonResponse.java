package com.example.storeservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse {
    private boolean success;
    private String resultCode;
    private String resultDesc;

    public CommonResponse(boolean success) {
        this.success = success;
    }
}
