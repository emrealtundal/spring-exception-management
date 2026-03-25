package com.emrealtundal.exception;


import lombok.Getter;

@Getter
public enum MessageType {

    RETURN_NULL_EXCEPTION("1001","İstek bulunamadı!"),
    BASKA_BIR_HATA("9009","Başka bir hata daha!");

    private String code;

    private String message;

    MessageType(String code, String message){
        this.code = code;
        this.message = message;
    }




}
