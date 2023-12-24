package com.shivaya.cricketboardobserver.manytomany.publisher.football;

import com.shivaya.cricketboardobserver.manytomany.subscriber.football.FootballSubscriber;

public interface FootBallPublisher {
    public void subscribe(FootballSubscriber subscriber);


    public void unsubscribe(FootballSubscriber subscriber) ;

    void notifyAll(int goal1, int  goal2, float duration);
    int getGoal1() ;

    int getGoal2()  ;

    float getDuration()  ;
}
