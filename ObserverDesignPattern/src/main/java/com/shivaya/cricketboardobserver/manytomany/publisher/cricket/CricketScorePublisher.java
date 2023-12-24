package com.shivaya.cricketboardobserver.manytomany.publisher.cricket;


import com.shivaya.cricketboardobserver.manytomany.subscriber.cricket.CricketScoreSubscriber;

public interface CricketScorePublisher {
    void subscribe(CricketScoreSubscriber subscriber);

    void unsubscribe(CricketScoreSubscriber subscriber);

    void notifyAll(int wickets, int runs, float overs);

    int getWicket();

    int getRuns();

    float getOvers();
}
