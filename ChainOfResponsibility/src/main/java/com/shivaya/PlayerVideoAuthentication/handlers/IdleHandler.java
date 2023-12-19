package com.shivaya.PlayerVideoAuthentication.handlers;

import com.shivaya.PlayerVideoAuthentication.data.Request;

public class IdleHandler implements RequestHandler{
    @Override
    public void handle(Request request) {
        System.out.println("All validation is passed");
    }
}
