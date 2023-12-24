package com.shivaya.cricketboardobserver.onetomany.subscriber;

import com.shivaya.cricketboardobserver.onetomany.publisher.Publisher;

public class TopDiscussionSubscriber implements Subscriber {
    int wicket;
    int runs;
    float overs;
    Publisher publisher;

    public TopDiscussionSubscriber(Publisher publisher) {
        this.publisher = publisher;
    }


    public void update( ) {
        this.runs = publisher.getRuns();
        this.overs = publisher.getOvers();
        this.wicket = publisher.getWicket();
        System.out.println(" TopDiscussionSubscriber --> " + wicket + " -> " + runs + " -> " + overs);

    }


    public Publisher getPublisher() {
        return publisher;
    }
}