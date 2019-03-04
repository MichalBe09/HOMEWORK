package com.company.homework;

public class BmiCounter {
    double height;
    double weight;


    public BmiCounter (){

    }

    public BmiCounter (double height, double weight){
        this.height = height;
        this.weight = weight;
    }


    public double getBMI(double height, double weight) {
height = height/100;
       return weight/(height*height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    }


