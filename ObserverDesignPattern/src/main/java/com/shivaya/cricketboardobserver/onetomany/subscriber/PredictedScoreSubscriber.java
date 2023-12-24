package com.shivaya.cricketboardobserver.onetomany.subscriber;

import com.shivaya.cricketboardobserver.onetomany.publisher.Publisher;

public class PredictedScoreSubscriber implements Subscriber {
    int wicket;
    int runs;
    float overs;
    Publisher publisher;

    public PredictedScoreSubscriber(Publisher publisher) {
        this.publisher = publisher;
    }

    public void update() {
        this.runs = publisher.getRuns();
        this.overs = publisher.getOvers();
        this.wicket = publisher.getWicket();
        System.out.println(" PredictedScoreSubscriber --> " + wicket + " -> " + runs + " -> " + overs);

    }


    public Publisher getPublisher() {
        return publisher;
    }
}
