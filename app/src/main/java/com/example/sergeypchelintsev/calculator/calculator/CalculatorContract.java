package com.example.sergeypchelintsev.calculator.calculator;

import com.example.sergeypchelintsev.calculator.BasePresenter;
import com.example.sergeypchelintsev.calculator.BaseView;

/**
 * Created by sergeypchelintsev on 01.03.2018.
 */

public interface CalculatorContract {

    interface View extends BaseView<Presenter>{
        void setResult(String result);
    }

    interface Presenter extends BasePresenter{

        void onPressNumber(int number);

        void onPressAdd();

        void onPressMin();

        void onPressDiv();

        void onPressMul();

        void onPressRes();

        void onPressC();
    }
}
