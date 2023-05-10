package com.booleanuk;

import java.util.ArrayList;

public class PlanItem {

    ArrayList<String> planItem;
    ArrayList<Integer> planCost;

    int capacity;

    public PlanItem(){
        this.planItem = new ArrayList<>();
        this.planCost = new ArrayList<>();
        this.capacity = 10;
    };

    public boolean add(String Item, int Cost){
        return true;
    }


}
