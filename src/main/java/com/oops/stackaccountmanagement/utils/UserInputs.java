package com.oops.stackaccountmanagement.utils;

import java.util.Scanner;

public class UserInputs {
    private static final Scanner sc = new Scanner(System.in);

    public static String strVal() {
        return sc.next();
    }
    public static int intVal() {
        return sc.nextInt();
    }
    public static double doubleVal() {
        return sc.nextDouble();
    }
}
