package com.shivaya.cricketboardobserver.manytomany.subscriber.cricket;



import com.shivaya.cricketboardobserver.manytomany.publisher.cricket.CricketScorePublisher;

import java.util.List;

public class TopDiscussionSubscriber implements CricketScoreSubscriber {
    int wicket;
    int runs;
    float overs;
    List<CricketScorePublisher> publishers;

    public TopDiscussionSubscriber(List<CricketScorePublisher> publishers) {
        this.publishers = publishers;
        for(CricketScorePublisher publisher:publishers){
            publisher.subscribe(this);
        }
    }


    public void update(CricketScorePublisher  cricketScorePublisher ) {
        this.runs = cricketScorePublisher.getRuns();
        this.overs = cricketScorePublisher.getOvers();
        this.wicket = cricketScorePublisher.getWicket();
        System.out.println(" TopDiscussionSubscriber --> " + wicket + " -> " + runs + " -> " + overs);

    }

}