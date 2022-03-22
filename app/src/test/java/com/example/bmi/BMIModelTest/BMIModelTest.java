package com.example.bmi.BMIModelTest;

import com.example.bmi.BMIModel;

import org.junit.Test;

public class BMIModelTest {
    @Test
    public void getBMITest(){
        double w,h;
        System.out.println("Testing BMI.getBMI");

        w = 90; h = 0.5 + 2.5 * Math.random();
        System.out.println(w + "," + h);
        System.out.println(BMIModel.getBMI(w,h));
    }

    @Test
    public void toDoubleTest(){
        String s = "45.5";
        System.out.println("Testing BMI.toDouble");

        double d = Double.parseDouble(s);
        System.out.println("Original string: " + s);
        System.out.println("Transformed into double: " + d);
        System.out.println("From original model: " + BMIModel.toDouble(s));
    }

    @Test
    public void formatBMITest(){
        double bmi = 27.8;
        double x = Math.round(bmi*10.0)/10.0;
        System.out.println("Testing BMI.formatBMI");

        String output = Double.toString(x);
        System.out.println("Test output: " + output);
        System.out.println("From original model: " + BMIModel.formatBMI(bmi));
    }

}
