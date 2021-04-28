package com.example.hchat.notification;

public class ApiResponse {

    private int success;

    public ApiResponse(int success) {
        this.success = success;
    }

    public ApiResponse() {
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }
}
