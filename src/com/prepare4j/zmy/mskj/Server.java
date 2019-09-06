package com.prepare4j.zmy.mskj;

class Server implements Runnable {

    private FoodList foodList;

    public Server (FoodList foodList) {
        this.foodList = foodList;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            foodList.foodserve();
        }

    }

}
