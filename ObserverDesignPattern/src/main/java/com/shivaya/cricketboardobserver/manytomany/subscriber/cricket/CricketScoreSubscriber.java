package com.shivaya.cricketboardobserver.manytomany.subscriber.cricket;

import com.shivaya.cricketboardobserver.manytomany.publisher.cricket.CricketScorePublisher;

public interface CricketScoreSubscriber {
    void update(CricketScorePublisher cricketScorePublisher);
}
