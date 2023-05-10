package com.booleanuk;

import java.util.ArrayList;

public class PlanItem {

    ArrayList<String> planItems;
    ArrayList<Integer> planCosts;

    int capacity;


    public PlanItem(){
        this.planItems = new ArrayList<>();
        this.planCosts = new ArrayList<>();
        this.capacity = 10;
    };

    public boolean add(String Item, int Cost){
        return true;
    }


}
