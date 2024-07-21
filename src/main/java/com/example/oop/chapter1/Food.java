package com.example.oop.chapter1;

public class Food {

    private long price;
    private long originCost;

    public long calculateRevenue() {
        return price;
    }

    public long calculateProfit() {
        return price - originCost;
    }
}
