package com.company;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum value = " + myMinFloatValue);
        System.out.println("Float Maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum value = " + myMinDoubleValue);
        System.out.println("Double Maximum value = " + myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5/3f;
        float myFloatValue2 = (float) 5.25;
        double myDoubleValue = 5/3d;

        System.out.println("MyIntValue = " +myIntValue);
        System.out.println("MyFloatValue = " +myFloatValue);
        System.out.println("MyDoubleValue = " +myDoubleValue);

        System.out.println("Converting Pound to Kilograms");

        double myPound = 200d;
        double myKG = (myPound * 0.45359237d);
        System.out.println("Converted value = " + myKG);
    }
}
