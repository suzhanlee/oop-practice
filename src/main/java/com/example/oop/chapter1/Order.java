package com.example.oop.chapter1;

import java.util.List;

public class Order {

    private List<Food> foods;
    private double transactionFeePercent;

    public long calculateRevenue() {
        long revenue = 0;
        for (Food food : foods) {
            revenue += food.calculateRevenue();
        }
        return revenue;
    }

    public long calculateProfit() {
        long income = 0;
        for (Food food : foods) {
            income += food.calculateProfit();
        }
        return (long) (income - calculateRevenue() * transactionFeePercent);
    }
}
