package com.example.sergeypchelintsev.calculator;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by sergeypchelintsev on 27.02.2018.
 */

public class KeyboardView extends FrameLayout {

    interface OnClickNumberListener {
        void onClickNumber(View view, int number);
    }


    private OnClickNumberListener listener;

    private CalculatorPresenter cPresenter;

    private Button button1 = findViewById(R.id.button1);
    private Button button2 = findViewById(R.id.button2);
    private Button button3 = findViewById(R.id.button3);
    private Button button4 = findViewById(R.id.button4);
    private Button button5 = findViewById(R.id.button5);
    private Button button6 = findViewById(R.id.button6);
    private Button button7 = findViewById(R.id.button7);
    private Button button8 = findViewById(R.id.button8);
    private Button button9 = findViewById(R.id.button9);
    private Button button0 = findViewById(R.id.button0);
    private Button buttonAdd = findViewById(R.id.buttonAdd);
    private Button buttonMin = findViewById(R.id.buttonMin);
    private Button buttonMul = findViewById(R.id.buttonMul);
    private Button buttonDiv = findViewById(R.id.buttonDiv);
    private Button buttonRes = findViewById(R.id.buttonRes);
    private Button buttonC = findViewById(R.id.buttonC);



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
    protected void onFinishInflate() {
        super.onFinishInflate();

        View.inflate(getContext(), R.layout.keyboard, this);
      //  button1.setOnClickListener(cPresenter.onPressNumber(1));
    }

    private void onClick(View view) {
        int number = Integer.valueOf(button1.getText().toString());

        if (listener != null) this.listener.onClickNumber(button1, number);
    }

    public void setOnClickNumberListener(OnClickNumberListener listener) {
        this.listener = listener;
    }
}
