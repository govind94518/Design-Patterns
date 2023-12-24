package com.shivaya.StockTradingApp.publisher;

import com.shivaya.StockTradingApp.subscriber.StockSubscriber;

import java.util.ArrayList;
import java.util.List;

public class StockUpdatePublisher implements StockPublisher{
    String name;
    List<StockSubscriber>subscribers;

    public StockUpdatePublisher(String name) {
        this.name = name;
        subscribers = new ArrayList<StockSubscriber>();
    }

    public void subscribe(StockSubscriber stockSubscriber) {
        this.subscribers.add(stockSubscriber);

    }

    public void unsubscribe(StockSubscriber stockSubscriber) {
        this.subscribers.remove(stockSubscriber);
    }

    public void notifyAllSubscriber(StockName stockName, StockValue stockvalue) {
        for(StockSubscriber subscriber: subscribers){
            subscriber.updateStock(stockName,stockvalue);
        }

    }
}
