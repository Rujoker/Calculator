package com.example.sergeypchelintsev.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements Keyboard.OnClickNumberListener {

    private static double a = 0;
    private static double b = 0;
    private static int opFlag = 0;

    @BindView(R.id.res) TextView res;
    @BindView(R.id.button0) Button button0;
    @BindView(R.id.button1) Button button1;
    @BindView(R.id.button2) Button button2;
    @BindView(R.id.button3) Button button3;
    @BindView(R.id.button4) Button button4;
    @BindView(R.id.button5) Button button5;
    @BindView(R.id.button6) Button button6;
    @BindView(R.id.button7) Button button7;
    @BindView(R.id.button8) Button button8;
    @BindView(R.id.button9) Button button9;
    @BindView(R.id.buttonAdd) Button buttonAdd;
    @BindView(R.id.buttonMin) Button buttonMin;
    @BindView(R.id.buttonMul) Button buttonMul;
    @BindView(R.id.buttonDiv) View buttonDiv;
    @BindView(R.id.buttonRes) Button buttonRes;
    @BindView(R.id.buttonC) Button buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        res.setText("");

        new Keyboard(this).setOnClickNumberListener(this);


    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (res.length()!= 0){
            outState.putDouble("tmp", Double.parseDouble(res.getText().toString()));
        }
        outState.putDouble("tmpA", a );
        outState.putDouble("tmpB", b );
        outState.putInt("tmpOp", opFlag );
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState.getDouble("tmp") != 0) {
            res.setText(Double.toString(savedInstanceState.getDouble("tmp")));
        }
        a = savedInstanceState.getDouble("tmpA");
        b = savedInstanceState.getDouble("tmpB");
        opFlag = savedInstanceState.getInt("tmpOp");
    }

//    public void onClick(View v) {
//
//        switch (v.getId()) {
//            case R.id.button1:
//                pushButton(v);
//                break;
//            case R.id.button2:
//                pushButton(v);
//                break;
//            case R.id.button3:
//                pushButton(v);
//                break;
//            case R.id.button4:
//                pushButton(v);
//                break;
//            case R.id.button5:
//                pushButton(v);
//                break;
//            case R.id.button6:
//                pushButton(v);
//                break;
//            case R.id.button7:
//                pushButton(v);
//                break;
//            case R.id.button8:
//                pushButton(v);
//                break;
//            case R.id.button9:
//                pushButton(v);
//                break;
//            case R.id.button0:
//                pushButton(v);
//                break;
//            case R.id.buttonAdd:
//                add(v);
//                break;
//            case R.id.buttonMin:
//                min(v);
//                break;
//            case R.id.buttonMul:
//                mul(v);
//                break;
//            case R.id.buttonDiv:
//                div(v);
//                break;
//            case R.id.buttonRes:
//                result(v);
//                break;
//            case R.id.buttonC:
//                clear(v);
//                break;
//        }
//    }

    public void pushButton(View v) {
        if (res.length() < 9) {
            res.setText(res.getText() + ((Button)v).getText().toString());
        }
        b = Double.parseDouble(res.getText().toString());
    }

    public void clear(View v) {
        res.setText("");
        a = 0;
        b = 0;
        opFlag = 0;
    }

    public void add(View v) {
        action(v);
        opFlag = 1;
    }

    public void min(View v) {
        action(v);
        opFlag = 2;
    }

    public void mul(View v) {
        action(v);
        opFlag = 3;
    }

    public void div(View v) {
        action(v);
        opFlag = 4;
    }

    public void action(View v) {
        if (res.length() != 0) {
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
                        Toast.makeText(this, "На ноль делить нельзя!!!", Toast.LENGTH_LONG).show();
                    }
                    break;
            }
            res.setText("");
            a = b;
        }
    }

    public void result (View v) {
        action(v);
        res.setText(Double.toString(b));
        opFlag = 0;
    }

    @Override
    public void onClickNumber(View view, int number) {

    }
}





