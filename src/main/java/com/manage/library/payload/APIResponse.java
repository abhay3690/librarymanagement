package com.manage.library.payload;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;


@Builder
public class APIResponse<T> {

    private T data;

    private String message;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    private HttpStatus status;

    public APIResponse() {}

    public APIResponse(T data) {
        this.data = data;
    }

    public APIResponse(String message) {
        this.message = message;
    }

    public APIResponse(String message,HttpStatus status){
        this.message=message;
        this.status=status;
    }

    public APIResponse(T data,HttpStatus status){
        this.data=data;
        this.status=status;
    }

    public APIResponse(T data,String message,HttpStatus status) {
        this.data = data;
        this.message = message;
        this.status=status;
    }

}
