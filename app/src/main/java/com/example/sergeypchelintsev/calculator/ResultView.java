package com.example.sergeypchelintsev.calculator;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by sergeypchelintsev on 01.03.2018.
 */

public class ResultView extends FrameLayout{

    @BindView(R.id.res) TextView res;
    @BindView(R.id.res2) TextView res2;

    public ResultView(@NonNull Context context) {
        super(context);
    }

    public ResultView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ResultView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ResultView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        View.inflate(getContext(), R.layout.result, this);
        ButterKnife.bind(this);
    }
}
