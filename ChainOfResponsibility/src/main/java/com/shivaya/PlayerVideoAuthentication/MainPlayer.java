package com.shivaya.PlayerVideoAuthentication;

import com.shivaya.PlayerVideoAuthentication.data.Request;

public class MainPlayer {
    public static void main(String[] args) {
        RequestHandlerFactory.getHandler("playvideo").handle(
                new Request("abc","def","ghi")
        );
    }
}
