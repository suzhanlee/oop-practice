package com.example.oop.chapter1;

import java.util.List;
import lombok.Getter;

@Getter
public class Order {

    private List<Food> foods;
    private double transactionFeePercent;
}
