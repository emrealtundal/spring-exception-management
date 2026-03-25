package com.emrealtundal.exception;

import lombok.Getter;

@Getter
public enum MessageType {

    NO_RECORD_EXIST("1001","kayıt bulunamadı");

    private String code;

    private String message;

    MessageType(String code, String message){
        this.code = code;
        this.message = message;
    }


}
