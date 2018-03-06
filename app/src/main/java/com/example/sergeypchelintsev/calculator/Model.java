package com.example.sergeypchelintsev.calculator;


/**
 * Created by sergeypchelintsev on 28.02.2018.
 */

public class Model {
    private double a = 0;
    private double b = 0;
    private int opFlag = 0;
    private String string = "";

    private ResultListener resultlistener;

    public void pushButton(int number) {
        string = string + number;
        b = Double.parseDouble(string);
        if (resultlistener != null) resultlistener.onResult(string);
    }

    public void clear() {
        string = "";
        a = 0;
        b = 0;
        opFlag = 0;
        if (resultlistener != null) resultlistener.onResult(string);
    }

    public void add() {
        action();
        opFlag = 1;
    }

    public void min() {
        action();
        opFlag = 2;
    }

    public void mul() {
        action();
        opFlag = 3;
    }

    public void div() {
        action();
        opFlag = 4;
    }

    private void action() {
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
        if (resultlistener != null) resultlistener.onResult(string);
    }

    public void result() {
        action();
        string = "" + b;
        opFlag = 0;
        if (resultlistener != null) resultlistener.onResult(string);
    }

    public void setResultListener(ResultListener resultListener) {
        this.resultlistener = resultListener;
    }

    interface ResultListener {
        void onResult(String string);
    }

}


