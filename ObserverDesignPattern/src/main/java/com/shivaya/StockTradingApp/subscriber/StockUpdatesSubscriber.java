package com.shivaya.StockTradingApp.subscriber;

import com.shivaya.StockTradingApp.publisher.StockName;
import com.shivaya.StockTradingApp.publisher.StockPublisher;
import com.shivaya.StockTradingApp.publisher.StockValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockUpdatesSubscriber implements StockSubscriber{
    private final String name;
    private Map<StockName,StockValue> stockValues;
    public StockUpdatesSubscriber(String name) {
        this.name = name;
        stockValues = new HashMap<StockName, StockValue>();
    }

    public void updateStock(StockName stockName, StockValue stockvalue) {
        if(!stockValues.containsKey(stockName) ||
                stockValues.get(stockName).getVersionNumber()<stockvalue.getVersionNumber()){
            stockValues.put(stockName,stockvalue);
            System.out.println(name+ " "+stockName + " " +
                    stockvalue.getAmount() + stockvalue.getCurrency()+stockvalue.getVersionNumber());
        }
    }
}
