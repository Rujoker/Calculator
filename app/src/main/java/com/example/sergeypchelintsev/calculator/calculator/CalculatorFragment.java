package com.example.sergeypchelintsev.calculator.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sergeypchelintsev.calculator.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by sergeypchelintsev on 02.03.2018.
 */

public class CalculatorFragment extends Fragment
        implements
        CalculatorContract.View,
        KeyboardView.OnClickNumberListener {

    private CalculatorContract.Presenter mPresenter;


    @BindView(R.id.res)
    TextView mResult;
    @BindView(R.id.keyboardView)
    KeyboardView keyboardView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calculator, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        keyboardView.setOnClickNumberListener(this);
    }


    @Override
    public void onClickNumber(View view, int number) {
        mPresenter.onPressNumber(number);
    }

    @Override
    public void onClickAdd(View view) {
        mPresenter.onPressAdd();

    }

    @Override
    public void onClickMin(View view) {
        mPresenter.onPressMin();
    }

    @Override
    public void onClickMul(View view) {
        mPresenter.onPressMul();
    }

    @Override
    public void onClickDiv(View view) {
        mPresenter.onPressDiv();
    }

    @Override
    public void onClickRes(View view) {
        mPresenter.onPressRes();
    }

    @Override
    public void onClickC(View view) {
        mPresenter.onPressC();
    }

    @Override
    public void setPresenter(@NonNull CalculatorContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void setResult(String result) {
        mResult.setText(result);
    }
}
