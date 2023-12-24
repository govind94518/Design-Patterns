package com.shivaya.StockTradingApp.publisher;

import com.shivaya.StockTradingApp.subscriber.StockSubscriber;

public interface StockPublisher {
    public void subscribe(StockSubscriber stockSubscriber);
    public void unsubscribe(StockSubscriber stockSubscriber);
    public   void notifyAllSubscriber(StockName stockName, StockValue stockvalue);
}
