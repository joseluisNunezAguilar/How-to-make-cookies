package com.company;
// Program tells you step by step on how to make cookies

// Calls methods
public class Main {
    public static void main(String[] args) {
        cakeBatter();
        bakeFirstBatchCookies();
        bakeSecondBatchCookies();
        decorateCookies();
    }

    // Steps to make a cake batter
    public static void cakeBatter() {
        System.out.println("FIRST STEP");
        System.out.println("Mix the dry ingredients.");
        System.out.println("Cream the butter and sugar.");
        System.out.println("Beat in the eggs.");
        System.out.println("Stir the dry ingredients");
        System.out.println("");
    }

    // Steps to make first batch of cookies
    public static void bakeFirstBatchCookies() {
        System.out.println("SECOND STEP");
        System.out.println("Set the oven temperature.");
        System.out.println("Set the timer.");
        System.out.println("Place the batch of cookies in the oven.");
        System.out.println("allow the cookies to bake.");
        System.out.println("");
    }

    // Steps to make second batch of cookies
    public static void bakeSecondBatchCookies() {
        System.out.println("THIRD STEP");
        System.out.println("Set the oven temperature.");
        System.out.println("Set the timer.");
        System.out.println("Place the batch of cookies in the oven.");
        System.out.println("allow the cookies to bake.");
        System.out.println("");
    }

    // Steps to decorate cookies
    public static void decorateCookies(){
        System.out.println("FOURTH STEP");
        System.out.println("Mix ingredients for frosting.");
        System.out.println("Spread frosting and sprinkles.");
        System.out.println("");
    }
}
