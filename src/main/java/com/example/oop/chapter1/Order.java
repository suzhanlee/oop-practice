package com.example.oop.chapter1;

import java.util.List;

public class Order implements Calculable {

    private List<Calculable> items;
    private double transactionFeePercent;

    public long calculateRevenue() {
        long revenue = 0;
        for (Calculable food : items) {
            revenue += food.calculateRevenue();
        }
        return revenue;
    }

    public long calculateProfit() {
        long income = 0;
        for (Calculable food : items) {
            income += food.calculateProfit();
        }
        return (long) (income - calculateRevenue() * transactionFeePercent);
    }
}
