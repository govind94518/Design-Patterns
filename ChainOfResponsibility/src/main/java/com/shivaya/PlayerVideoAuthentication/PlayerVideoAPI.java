package com.shivaya.PlayerVideoAuthentication;

import com.shivaya.PlayerVideoAuthentication.data.Request;
import com.shivaya.PlayerVideoAuthentication.data.Response;
import com.shivaya.PlayerVideoAuthentication.data.TokenManager;
import com.shivaya.PlayerVideoAuthentication.data.UserManager;
import com.shivaya.PlayerVideoAuthentication.handlers.*;


public class PlayerVideoAPI {
    private final RequestHandler requestHandler;

    public PlayerVideoAPI(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }
    public Response playVideo(Request request) {
        RequestHandlerFactory.getHandler("playVideo").handle(request);
        return null;
    }

}
