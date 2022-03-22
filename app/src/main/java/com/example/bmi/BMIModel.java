package com.example.bmi;

public class BMIModel {

    public static double toDouble(String s){
        return Double.parseDouble(s);

    }

    public static double getBMI(double weight, double height){
        return weight/Math.pow(height, 2);

    }

    public static String formatBMI(double bmi){
        double x = Math.round(bmi*10.0)/10.0;
        return Double.toString(x);
    }

}
