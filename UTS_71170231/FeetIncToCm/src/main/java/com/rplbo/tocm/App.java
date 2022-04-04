package com.rplbo.tocm;

/**
 * Hello world!
 *
 */
public class App 
{
    static double FeetIncToCm(int inc){
        int centi = 0;
        if (inc >= 0) {
            System.out.println("CM : " +FeetIncToCm(1,3));
        } else {
            return -1;
        }

        return centi;

    }
    static double FeetIncToCm(double inch, double feet) {

        int inc = 15;
        if (inch >= 0) {
            inch = 0.3937 * inc;
            feet = 0.0328 * inc;
            System.out.println("inch :" +inch );
            System.out.println("feet :" +feet);
        } else {
            return -1;
        }

        return inc;
    }
    public static void main( String[] args ) {
        FeetIncToCm(15);



    }
}
