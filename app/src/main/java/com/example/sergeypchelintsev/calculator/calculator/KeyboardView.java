package com.example.sergeypchelintsev.calculator.calculator;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.sergeypchelintsev.calculator.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by sergeypchelintsev on 27.02.2018.
 */

public class KeyboardView extends FrameLayout {

    interface OnClickNumberListener {
        void onClickNumber(View view, int number);

        void onClickAdd(View view);
        void onClickMin(View view);
        void onClickMul(View view);
        void onClickDiv(View view);
        void onClickRes(View view);
        void onClickC(View view);
    }


    private OnClickNumberListener listener;

    private CalculatorContract cPresenter;

    @BindView(R.id.button1) Button button1;
    @BindView(R.id.button2) Button button2;
    @BindView(R.id.button3) Button button3;
    @BindView(R.id.button4) Button button4;
    @BindView(R.id.button5) Button button5;
    @BindView(R.id.button6) Button button6;
    @BindView(R.id.button7) Button button7;
    @BindView(R.id.button8) Button button8;
    @BindView(R.id.button9) Button button9;
    @BindView(R.id.button0) Button button0 ;
    @BindView(R.id.buttonAdd) Button buttonAdd ;
    @BindView(R.id.buttonMin) Button buttonMin;
    @BindView(R.id.buttonMul) Button buttonMul;
    @BindView(R.id.buttonDiv) Button buttonDiv;
    @BindView(R.id.buttonRes) Button buttonRes;
    @BindView(R.id.buttonC) Button buttonC;



    public KeyboardView(@NonNull Context context) {
        super(context);
    }

    public KeyboardView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public KeyboardView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public KeyboardView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }


    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        View.inflate(getContext(), R.layout.keyboard, this);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.button0, R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5,
            R.id.button6, R.id.button7, R.id.button8, R.id.button9})
    public void onClick(View view) {
        int number;
        number = 0;
        switch (view.getId()) {
            case R.id.button1:
                number = Integer.valueOf(button1.getText().toString());
                break;
            case R.id.button2:
                number = Integer.valueOf(button2.getText().toString());
                break;
            case R.id.button3:
                number = Integer.valueOf(button3.getText().toString());
                break;
            case R.id.button4:
                number = Integer.valueOf(button4.getText().toString());
                break;
            case R.id.button5:
                number = Integer.valueOf(button5.getText().toString());
                break;
            case R.id.button6:
                number = Integer.valueOf(button6.getText().toString());
                break;
            case R.id.button7:
                number = Integer.valueOf(button7.getText().toString());
                break;
            case R.id.button8:
                number = Integer.valueOf(button8.getText().toString());
                break;
            case R.id.button9:
                number = Integer.valueOf(button9.getText().toString());
                break;
            case R.id.button0:
                number = Integer.valueOf(button0.getText().toString());
                break;
        }
        if (listener != null) this.listener.onClickNumber(view, number);

    }

    @OnClick(R.id.buttonAdd)
    public void onClickAdd(View view) {
        if (listener != null) this.listener.onClickAdd(view);
    }

    @OnClick(R.id.buttonMin)
    public void onClickMin(View view) {
        if (listener != null) this.listener.onClickMin(view);
    }

    @OnClick(R.id.buttonMul)
    public void onClickMul(View view) {
        if (listener != null) this.listener.onClickMul(view);
    }

    @OnClick(R.id.buttonDiv)
    public void onClickDiv(View view) {
        if (listener != null) this.listener.onClickDiv(view);
    }

    @OnClick(R.id.buttonRes)
    public void onClickRes(View view) {
        if (listener != null) this.listener.onClickRes(view);
    }

    @OnClick(R.id.buttonC)
    public void onClickC(View view) {
        if (listener != null) this.listener.onClickC(view);
    }

    public void setOnClickNumberListener(OnClickNumberListener listener) {
        this.listener = listener;
    }
}
