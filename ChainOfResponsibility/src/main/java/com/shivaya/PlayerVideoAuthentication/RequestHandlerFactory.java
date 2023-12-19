package com.shivaya.PlayerVideoAuthentication;

import com.shivaya.PlayerVideoAuthentication.data.TokenManager;
import com.shivaya.PlayerVideoAuthentication.data.UserManager;
import com.shivaya.PlayerVideoAuthentication.handlers.*;

public class RequestHandlerFactory {
    private  RequestHandlerFactory(){}
    public static RequestHandler getHandler(String apiName){
        return   new ValidationHandler(
                new AuthenticationHandler(
                        new AuthorizationHandler(new IdleHandler(),new UserManager()),
                        new TokenManager()
                )
        );
    }
}
