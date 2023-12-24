package com.shivaya.cricketboardobserver.manytomany.subscriber.football;

import com.shivaya.cricketboardobserver.manytomany.publisher.football.FootBallPublisher;

import java.util.List;

public class FootballScoreSubscriber implements FootballSubscriber{

    List<FootBallPublisher> publishers;

    public void update(FootBallPublisher footBallPublisher) {

    }
}
