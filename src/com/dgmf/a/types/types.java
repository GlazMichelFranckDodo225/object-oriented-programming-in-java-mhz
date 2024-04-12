package com.dgmf.a.types;

import java.util.Date;

public class types {
    public static void main(String[] args) {
        /* Primitive Types */
        byte myNumber = 5;
        int viewsCount = 123_456_789;
        // int viewsCount = 3_123_456_789; // Error => Integer Number Too Large
        long longViewsCount = 3_123_456_789L;
        float price = 147.99F;
        double doubleViewsCount = 3_123_456_789D; // Or "3_123_456_789."
        char letter = 'B';
        boolean isActive = true; // Or "false;

        /* Reference Types */
        Date date = new Date();
        // System.out.println("date"); // Non
        System.out.println(date);
    }
}
