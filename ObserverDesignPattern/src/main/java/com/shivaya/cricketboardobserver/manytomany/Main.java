package com.shivaya.cricketboardobserver.manytomany;

import com.shivaya.cricketboardobserver.onetomany.publisher.CricketScorePublisher;
import com.shivaya.cricketboardobserver.onetomany.publisher.Publisher;
import com.shivaya.cricketboardobserver.onetomany.subscriber.PredictedScoreSubscriber;
import com.shivaya.cricketboardobserver.onetomany.subscriber.RunRateSubscriber;
import com.shivaya.cricketboardobserver.onetomany.subscriber.Subscriber;
import com.shivaya.cricketboardobserver.onetomany.subscriber.TopDiscussionSubscriber;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ) {
        Publisher cricketScorePublisher = new CricketScorePublisher();
        Subscriber   predictedScoreSubscriber = new PredictedScoreSubscriber(cricketScorePublisher);
        Subscriber   runRateSubscriber = new RunRateSubscriber(cricketScorePublisher);
        Subscriber   topDiscussionSubscriber = new TopDiscussionSubscriber(cricketScorePublisher);
        runRateSubscriber.getPublisher().subscribe(runRateSubscriber);
        predictedScoreSubscriber.getPublisher().subscribe(predictedScoreSubscriber);
        topDiscussionSubscriber.getPublisher().subscribe(topDiscussionSubscriber);
        connectSubscriber( cricketScorePublisher);
        System.out.println("UnSubscribing  topDiscussionSubscribe");
        topDiscussionSubscriber.getPublisher().unsubscribe(topDiscussionSubscriber);
        connectSubscriber( cricketScorePublisher);
    }
    private static void connectSubscriber(Publisher cricketScorePublisher) {
        cricketScorePublisher.notifyAll(3,111,12.3f);
    }
}
