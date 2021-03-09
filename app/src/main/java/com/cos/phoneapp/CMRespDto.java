package com.cos.phoneapp;

public class CMRespDto<T> {
    private int code;
    private T data;//T or Phone

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public CMRespDto(){
        //생성자
    }

    public CMRespDto(int code, T data) {
        this.code = code;
        this.data = data;
    }
}
