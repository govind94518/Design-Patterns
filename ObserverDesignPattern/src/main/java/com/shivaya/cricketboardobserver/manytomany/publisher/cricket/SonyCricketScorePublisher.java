package com.shivaya.cricketboardobserver.manytomany.publisher.cricket;
import com.shivaya.cricketboardobserver.manytomany.subscriber.cricket.CricketScoreSubscriber;

import java.util.ArrayList;
import java.util.List;

public class SonyCricketScorePublisher implements CricketScorePublisher {
    int wickets;
    int runs;
    float overs;
    List<CricketScoreSubscriber> subscribers;

    public SonyCricketScorePublisher() {
        this.wickets = 0;
        this.runs = 0;
        this.overs = 0;
        this.subscribers = new ArrayList< CricketScoreSubscriber>();
    }

    public void subscribe( CricketScoreSubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void unsubscribe( CricketScoreSubscriber subscriber) {
        this.subscribers.remove(subscriber);
    }


    public void notifyAll(int wickets, int runs, float overs) {
        for ( CricketScoreSubscriber subscriber : subscribers) {
            subscriber.update(this);
        }
    }
    public int getWicket() {
        return wickets;
    }

    public int getRuns() {
        return runs;
    }

    public float getOvers() {
        return overs;
    }
}
