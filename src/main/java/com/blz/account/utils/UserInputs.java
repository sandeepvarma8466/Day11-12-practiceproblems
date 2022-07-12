package com.blz.account.utils;

import java.util.Scanner;

public class UserInputs {
    private static final Scanner sc=new Scanner (System.in);
    public static String strVal() {
        return sc.next();
    }
    public static long longVal() {
        return sc.nextLong();
    }
    public static int intVal() {
        return sc.nextInt();
    }
}
