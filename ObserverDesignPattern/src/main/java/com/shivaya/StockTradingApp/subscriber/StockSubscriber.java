package com.shivaya.StockTradingApp.subscriber;

import com.shivaya.StockTradingApp.publisher.StockName;
import com.shivaya.StockTradingApp.publisher.StockValue;

public interface StockSubscriber {
        void updateStock(StockName stockName, StockValue stockvalue);
}
