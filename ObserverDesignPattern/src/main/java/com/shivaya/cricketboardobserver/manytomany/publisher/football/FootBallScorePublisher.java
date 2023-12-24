package com.shivaya.cricketboardobserver.manytomany.publisher.football;

import com.shivaya.cricketboardobserver.manytomany.subscriber.football.FootballSubscriber;

import java.util.List;

public class FootBallScorePublisher implements FootBallPublisher {

    List<FootballSubscriber> subscribers;
    int goal1  ;

    int goal2   ;

    float duration  ;
    public void subscribe(FootballSubscriber subscriber) {

    }

    public void unsubscribe(FootballSubscriber subscriber) {

    }



    public void notifyAll(int goal1, int  goal2, float duration) {

    }

    public int getGoal1() {
        return goal1;
    }

    public int getGoal2() {
        return goal2;
    }

    public float getDuration() {
        return duration;
    }
}
