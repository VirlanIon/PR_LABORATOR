package at.utm.md;


import org.apache.commons.math3.complex.Complex;

public class App

{

    public static void main (String[] args ){

        Complex op1 = new Complex ( 2.0, 5.0);
        Complex op2 = new Complex ( 3.0, 1.0);

        Complex answer1 = op1.add(op2);
        Complex answer2 = op2.subtract(op1);

        Complex answer3 = op2.conjugate();

        System.out.printf("First nr. >>" + op1);
        System.out.println("Second nr. >> " + op2);
        System.out.println("Sum of the nr. are >>" + answer1);
        System.out.println("Substract >>" + answer2);
        System.out.println("Conjugate >>" + answer3);
    }

}