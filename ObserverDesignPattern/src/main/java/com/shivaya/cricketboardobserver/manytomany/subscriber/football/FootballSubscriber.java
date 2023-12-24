package com.shivaya.cricketboardobserver.manytomany.subscriber.football;

import com.shivaya.cricketboardobserver.manytomany.publisher.football.FootBallPublisher;

public interface FootballSubscriber   {
    void update(FootBallPublisher footBallPublisher);
}
