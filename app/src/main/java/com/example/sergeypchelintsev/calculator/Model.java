package com.example.sergeypchelintsev.calculator;


/**
 * Created by sergeypchelintsev on 28.02.2018.
 */

public class Model {
    private static double a = 0;
    private static double b = 0;
    private static int opFlag = 0;
    private static String string = "";

    public static void pushButton(int number) {
        string = string + number;
        b = Double.parseDouble(string);
    }

    public static void clear() {
        string = "";
        a = 0;
        b = 0;
        opFlag = 0;
    }

    public static void add() {
        action();
        opFlag = 1;
    }

    public static void min() {
        action();
        opFlag = 2;
    }

    public static void mul() {
        action();
        opFlag = 3;
    }

    public static void div() {
        action();
        opFlag = 4;
    }

    private static void action() {
        if (string.length() != 0) {
            switch (opFlag) {
                case 0:
                    a = b;
                    break;
                case 1:
                    b = a + b;
                    break;
                case 2:
                    b = a - b;
                    break;
                case 3:
                    b = a * b;
                    break;
                case 4:
                    if (b != 0) {
                        b = a / b;
                    } else {
                     //   Toast.makeText(this, "На ноль делить нельзя!!!", Toast.LENGTH_LONG).show();
                    }
                    break;
            }
            string = "";
            a = b;
        }
    }

    public static void result() {
        action();
        string = "" + b;
        opFlag = 0;
    }

    public static String getResult() {
        return string;
    }
}
