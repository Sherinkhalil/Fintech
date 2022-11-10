package com.example.recycler_view;

public class MyAdapter {
    private String adapterName;
    private int distanceFromSun;
    private int gravity;
    private int diameter;



    // add constructor

    public MyAdapter(String adapterName, int distanceFromSun, int gravity, int diameter) {
        this.adapterName = adapterName;
        this.distanceFromSun = distanceFromSun;
        this.gravity = gravity;
        this.diameter = diameter;
    }

    public String getAdapterName() {
        return adapterName;
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getGravity() {
        return gravity;
    }

    public int getDiameter() {
        return diameter;
    }
}
