package com.dgmf.b.primitive.vs.reference;

import java.awt.*;

public class PrimitiveVsReference {
    public static void main(String[] args) {
        /* Primitive Types ==> Copy by Value */
        System.out.println("**** Primitive Types ==> Copy by Value ****");
        byte x = 1;
        byte y = x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("*****************");
        x = 2; // Here, has the Value of y changed or not ?
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("=================");

        /* Reference Types ==> Copy by Reference */
        System.out.println("**** Reference Types ==> Copy by Reference ****");
        Point p1 = new Point(1, 1);
        System.out.println("p1 contains : " + p1);
        Point p2 = p1;
        System.out.println("p2 contains : " + p2);
        p1.x = 2; // Here, has the Value of p2 changed or not ?
        System.out.println("p1.x = " + p1.x);
        System.out.println("p2.x = " + p2.x);
    }
}
