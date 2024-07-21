package com.example.oop.chapter1;

import java.util.List;
import lombok.Getter;

@Getter
public class Store {

    private List<Order> orders;
    private long rentalFee;
}
