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

/**
 * Created by sergeypchelintsev on 27.02.2018.
 */

public class Keyboard extends FrameLayout {

    interface OnClickNumberListener {
        void onClickNumber(View view, int number);
    }


    private OnClickNumberListener listener;

    private Button button1;

    public Keyboard(@NonNull Context context) {
        super(context);
    }

    public Keyboard(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Keyboard(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public Keyboard(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        View.inflate(getContext(), R.layout.keyboard, this);
      //  button1.setOnClickListener();
    }

    private void onClick(View view) {
        int number = Integer.valueOf(button1.getText().toString());

        if (listener != null) this.listener.onClickNumber(button1, number);
    }

    public void setOnClickNumberListener(OnClickNumberListener listener) {
        this.listener = listener;
    }
}
