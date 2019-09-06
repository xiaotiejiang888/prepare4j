package com.prepare4j.zmy.mskj;

class Cooker implements Runnable {

    private FoodList foodList;

    public Cooker (FoodList foodList) {
        this.foodList = foodList;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(180000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            foodList.foodmake();
        }

    }

}
