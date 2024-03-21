package com.example.demo;

import java.util.Date;

public class dtoMessage {
    private final Date serverDateTime;
    private final String type;
    private final String message;

    public dtoMessage(String type, String message) {
        this.type = type;
        this.message = message;
        this.serverDateTime = new Date();
    }

    public Date getServerDateTime() {
        return serverDateTime;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
