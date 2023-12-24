package com.shivaya.cricketboardobserver.onetomany.subscriber;

import com.shivaya.cricketboardobserver.onetomany.publisher.Publisher;

public class RunRateSubscriber implements Subscriber {
    int wicket;
    int runs;
    float overs;
    Publisher publisher;

    public RunRateSubscriber(Publisher publisher) {
        this.publisher = publisher;
    }


    public void update( ) {
        this.runs = publisher.getRuns();
        this.overs = publisher.getOvers();
        this.wicket = publisher.getWicket();
        System.out.println(" RunRateSubscriber --> " + wicket + " -> " + runs + " -> " + overs);

    }

    public Publisher getPublisher() {
        return publisher;
    }
}