package com.shivaya.PlayerVideoAuthentication.handlers;

import com.shivaya.PlayerVideoAuthentication.data.Request;
import com.shivaya.PlayerVideoAuthentication.data.TokenManager;
import com.shivaya.PlayerVideoAuthentication.data.UserManager;

public class AuthorizationHandler implements RequestHandler{
    private final RequestHandler nextRequestHandler;
    private final UserManager userManager;

    public  AuthorizationHandler(RequestHandler nextRequestHandler,  UserManager userManager) {
        this.nextRequestHandler = nextRequestHandler;
        this.userManager = userManager;
    }

    public void handle(Request request) {
       if(! this.userManager.isSubscribed(request.getToken()))
           throw new RuntimeException("Authorization is failed");
        System.out.println("Authorization passed");
       this.nextRequestHandler.handle(request);
    }
}
