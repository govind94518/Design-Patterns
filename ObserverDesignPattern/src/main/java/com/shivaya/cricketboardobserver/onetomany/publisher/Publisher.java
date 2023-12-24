package com.shivaya.cricketboardobserver.onetomany.publisher;

import com.shivaya.cricketboardobserver.onetomany.subscriber.Subscriber;

public interface Publisher {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifyAll(int wickets, int runs, float overs);
    int getWicket() ;

    int getRuns()  ;

    float getOvers()  ;
}
