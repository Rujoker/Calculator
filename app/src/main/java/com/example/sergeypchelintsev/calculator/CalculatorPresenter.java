package com.example.sergeypchelintsev.calculator;

/**
 * Created by sergeypchelintsev on 01.03.2018.
 */

public interface CalculatorPresenter extends BasePresenter{

    void onPressNumber(int number);

    void onPressResult();
}
