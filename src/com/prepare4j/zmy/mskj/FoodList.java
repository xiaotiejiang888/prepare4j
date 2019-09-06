package com.prepare4j.zmy.mskj;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FoodList {
    private List<Food> foodList;

    public FoodList() {
    }

    public FoodList (List<Food> foodList) {
        this.foodList = foodList;
    }

    public synchronized void foodmake() {
        if (foodList == null) {
            foodList = new ArrayList<Food>();
        }
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            foodList.add(new Food("宫保鸡丁"));
        } else {
            foodList.add(new Food("鱼香肉丝"));
        }
    }

    public synchronized void foodserve() {
        if (foodList == null || foodList.size() == 0) {
            return;
        }
        foodList.remove(0);
    }

}
