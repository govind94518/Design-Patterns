package com.shivaya.cricketboardobserver.onetomany.publisher;

import com.shivaya.cricketboardobserver.onetomany.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class CricketScorePublisher implements Publisher {
    int wickets;
    int runs;
    float overs;
    List<Subscriber> subscribers;

    public CricketScorePublisher() {
        this.wickets = 0;
        this.runs = 0;
        this.overs = 0;
        this.subscribers = new ArrayList<Subscriber>();
    }

    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }


    public void notifyAll(int wickets, int runs, float overs) {
        for (  Subscriber subscriber : subscribers) {
            subscriber.update();
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
