package com.project.n1.demo.exception;

import lombok.Data;

@Data
public class CustomizeException extends RuntimeException{
    private String message;
    private Integer code;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.code=errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
