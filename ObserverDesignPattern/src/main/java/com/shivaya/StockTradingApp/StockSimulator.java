package com.shivaya.StockTradingApp;

import com.shivaya.StockTradingApp.publisher.*;
import com.shivaya.StockTradingApp.subscriber.StockSubscriber;
import com.shivaya.StockTradingApp.subscriber.StockUpdatesSubscriber;

public class StockSimulator {
    public static void main(String[] args) {
        StockPublisher BsePublisher = new StockUpdatePublisher(" BSE");
        StockPublisher NsePublisher = new StockUpdatePublisher(" NSE");
        StockSubscriber subscriber1 = new StockUpdatesSubscriber("subscriber1");
        StockSubscriber subscriber2 = new StockUpdatesSubscriber("subscriber2");
        StockSubscriber subscriber3 = new StockUpdatesSubscriber("subscriber3");
        BsePublisher.subscribe(subscriber1);
        BsePublisher.subscribe(subscriber2);
        NsePublisher.subscribe(subscriber2);
        NsePublisher.subscribe(subscriber3);
        System.out.println(" NsePublisher");
        NsePublisher.notifyAllSubscriber(StockName.AMZN,
                new StockValue(1,100, Currency.INR));
        NsePublisher.notifyAllSubscriber(StockName.AMZN,
                new StockValue(2,200, Currency.INR));
        NsePublisher.notifyAllSubscriber(StockName.AMZN,
                new StockValue(1,100, Currency.INR));
        System.out.println(" BsePublisher");

        BsePublisher.notifyAllSubscriber(StockName.AMZN,
                new StockValue(2,200, Currency.INR));
        BsePublisher.notifyAllSubscriber(StockName.NETFLIX,
                new StockValue(1,300, Currency.INR));
    }
}
