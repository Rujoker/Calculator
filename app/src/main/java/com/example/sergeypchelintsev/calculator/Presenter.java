package com.example.sergeypchelintsev.calculator;

/**
 * Created by sergeypchelintsev on 28.02.2018.
 */

public class Presenter implements CalculatorPresenter {

    private CalculatorView view;

    public Presenter(CalculatorView view) {
        this.view = view;
    }

    public static void clicked(int id){
        switch (id) {
            case R.id.button1:
                Model.pushButton(1);
                break;
            case R.id.button2:
                Model.pushButton(2);
                break;
            case R.id.button3:
                Model.pushButton(3);
                break;
            case R.id.button4:
                Model.pushButton(4);
                break;
            case R.id.button5:
                Model.pushButton(5);
                break;
            case R.id.button6:
                Model.pushButton(6);
                break;
            case R.id.button7:
                Model.pushButton(7);
                break;
            case R.id.button8:
                Model.pushButton(8);
                break;
            case R.id.button9:
                Model.pushButton(9);
                break;
            case R.id.button0:
                Model.pushButton(0);
                break;
            case R.id.buttonAdd:
                Model.add();
                break;
            case R.id.buttonMin:
                Model.min();
                break;
            case R.id.buttonMul:
                Model.mul();
                break;
            case R.id.buttonDiv:
                Model.div();
                break;
            case R.id.buttonRes:
                Model.result();
                break;
            case R.id.buttonC:
                Model.clear();
                break;
        }
    }

    public static String getResult() {
        return Model.getResult();
    }

    @Override
    public void onPressNumber(int number) {
        view.setResult(String.valueOf(number));
    }

    @Override
    public void onPressResult() {
        view.setResult();
    }

    @Override
    public void start() {

    }
}
