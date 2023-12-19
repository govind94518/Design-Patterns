package com.shivaya.PlayerVideoAuthentication.handlers;

import com.shivaya.PlayerVideoAuthentication.data.Request;

public class ValidationHandler implements RequestHandler{
    private final RequestHandler nextRequestHandler;

    public ValidationHandler(RequestHandler requestHandler) {
        this.nextRequestHandler = requestHandler;
    }

    public void handle(Request request) {
        if(request.getHeader()==null || request.getHeader().isEmpty())
            throw new IllegalArgumentException("Header is Empty");
        if(request.getBody()==null || request.getBody().isEmpty())
            throw new IllegalArgumentException("Header is Empty");
        System.out.println("validation is passed ");
        this.nextRequestHandler.handle(request);
    }
}
