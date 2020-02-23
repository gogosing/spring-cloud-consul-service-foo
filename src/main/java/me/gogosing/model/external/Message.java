package me.gogosing.model.external;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by JinBum Jeong on 2020/02/23.
 */
public class Message {

    @JsonProperty(value = "message")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
