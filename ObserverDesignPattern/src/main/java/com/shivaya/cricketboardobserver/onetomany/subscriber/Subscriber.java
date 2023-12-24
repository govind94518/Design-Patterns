package com.shivaya.cricketboardobserver.onetomany.subscriber;

import com.shivaya.cricketboardobserver.onetomany.publisher.Publisher;

public interface Subscriber {
    void update();


    Publisher getPublisher() ;
}
