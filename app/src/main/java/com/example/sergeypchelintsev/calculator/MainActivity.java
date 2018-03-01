package com.example.sergeypchelintsev.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.res) TextView res;

//    private CalculatorPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        res.setText("");
//        this.presenter = new Presenter(this);
//        new KeyboardView(this).setOnClickNumberListener(this);
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
//        if (res.length()!= 0){
//            outState.putDouble("tmp", Double.parseDouble(res.getText().toString()));
//        }
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
//        if (savedInstanceState.getDouble("tmp") != 0) {
//            res.setText(Double.toString(savedInstanceState.getDouble("tmp")));
//        }
    }

//      public void onClick(View v, int number) {
//        this.presenter.onPressNumber(number);
//      }
//
//    @Override
//    public void onClickNumber(View view, int number) {
//
//    }
//
//    @Override
//    public void setResult(String result) {
//        res.setText(result);
//    }
}





