package com.example.sergeypchelintsev.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.sergeypchelintsev.calculator.calculator.CalculatorFragment;

public class MainActivity extends AppCompatActivity {


    private  Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalculatorFragment fragment = new CalculatorFragment();
        mPresenter = new Presenter(fragment, new Model());

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container_frame, fragment)
                .commit();
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

}





