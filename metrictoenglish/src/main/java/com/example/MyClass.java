package com.example;

public class MyClass {

    public static void main(String[] args){
        double meter=28;
        double kilometer=168;
        double centimeter=47;
        double kph=27;
        double liters=92;
        double kilograms=200;

        double yard;
        double mile;
        double inch;
        double fps;
        double pound;
        double gallon;


        yard= meter*.9;

        mile=kilometer/1.6;

        inch=centimeter*.4;

        fps=kph * 0.911344;

       pound= kilograms *2.2;
         gallon= liters/3.8 ;

        System.out.println("Meter to Yard = "+yard +"yards");
        System.out.println("Kilometer to mile = "+mile + "miles");
        System.out.println("centimeter to inch = "+inch+"inches");
        System.out.println("Kilometers per hour to Feet per second = "+fps+"fps");
        System.out.println("kilograms to pounds ="+pound+"pounds");
        System.out.println("Liters to gallons = "+gallon + "gallons");



    }
}
