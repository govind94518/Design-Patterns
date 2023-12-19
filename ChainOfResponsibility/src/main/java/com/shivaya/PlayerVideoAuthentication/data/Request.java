package com.shivaya.PlayerVideoAuthentication.data;

import lombok.Builder;


public class Request {
    public  String header;
    public String body;
    public String token;

    public Request(String header, String body, String token) {
        this.header = header;
        this.body = body;
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public String getBody() {
        return body;
    }

    public Request(String header) {
        this.header = header;
    }

    public String getHeader() {
        return header;
    }
}
