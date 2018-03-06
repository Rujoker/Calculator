package com.example.sergeypchelintsev.calculator;

import android.support.annotation.NonNull;

import com.example.sergeypchelintsev.calculator.calculator.CalculatorContract;

/**
 * Created by sergeypchelintsev on 28.02.2018.
 */

public class Presenter implements
        CalculatorContract.Presenter,
        Model.ResultListener {

    private CalculatorContract.View mView;

    private Model calculator;

    public Presenter(@NonNull CalculatorContract.View view, Model model) {
        calculator = model;
        model.setResultListener(this);
        mView = view;
        mView.setPresenter(this);
    }

    public void onResult(String result) {
        mView.setResult(result);
    }

    @Override
    public void onPressNumber(int number) {
        calculator.pushButton(number);
    }

    @Override
    public void onPressAdd() {
        calculator.add();
    }

    @Override
    public void onPressMin() {
        calculator.min();
    }

    @Override
    public void onPressDiv() {
        calculator.div();
    }

    @Override
    public void onPressMul() {
        calculator.mul();
    }

    @Override
    public void onPressRes() {
        calculator.result();
    }

    @Override
    public void onPressC() {
        calculator.clear();
    }

    @Override
    public void start() {

    }
}
