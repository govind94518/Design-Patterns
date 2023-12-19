package com.shivaya.PlayerVideoAuthentication.handlers;

import com.shivaya.PlayerVideoAuthentication.data.Request;
import com.shivaya.PlayerVideoAuthentication.data.TokenManager;

public class AuthenticationHandler implements RequestHandler{
    private final RequestHandler nextRequestHandler;
    private final TokenManager tokenManager;

    public AuthenticationHandler(RequestHandler nextRequestHandler, TokenManager tokenManager) {
        this.nextRequestHandler = nextRequestHandler;
        this.tokenManager = tokenManager;
    }

    public void handle(Request request) {
       String email = this.tokenManager.getEmailFromToken(request.getToken());
       if(!isValid(email)) throw  new RuntimeException("Authentication Failed");
        System.out.println("Authentication passed");
       this.nextRequestHandler.handle(request);
    }

    private boolean isValid(String email) {
        return  true;
    }
}
