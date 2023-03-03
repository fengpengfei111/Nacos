package com.example.storeservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonModelResponse<T> extends CommonResponse {
    private T data;

}
