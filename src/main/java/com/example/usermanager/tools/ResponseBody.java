package com.example.usermanager.tools;

import lombok.Data;

@Data
public class ResponseBody<T> {
    private int status;
    private String message;
    private T data;

    public ResponseBody(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
