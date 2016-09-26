package com.example.didoy.cardviews.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.didoy.cardviews.R;
import com.example.didoy.cardviews.Util.AnimateUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Didoy on 9/26/2016.
 */
public class AnimationSetOne extends Fragment{


    @BindView(R.id.rotateX) Button btnRotateX;
    @BindView(R.id.rotateY) Button btnRotateY;
    @BindView(R.id.rotate) Button btnRotate;
    @BindView(R.id.fadeOut) Button btnFadeIn;
    @BindView(R.id.fadeIn) Button btnFadeOut;

    private CardView cardView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cardView = (CardView) getActivity().findViewById(R.id.card1);
        System.out.println("onCreate");

    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.set_one, container, false);
        ButterKnife.bind(this, v );
        System.out.println("onCreateView");

        return  v;
    }

    @OnClick(R.id.rotateX) void rotateX(){
        AnimateUtil.rotateX(cardView, 180f, 1000, null, true);
    }
    @OnClick(R.id.rotateY) void rotateY(){
         AnimateUtil.rotateY(cardView, 180f, 2000, null, true);
    }
    @OnClick(R.id.rotate) void rotate(){
        AnimateUtil.rotate(cardView, 180, 1000, null, false);
    }
    @OnClick(R.id.fadeIn) void fadeIn(){
        AnimateUtil.fadeIn(cardView, 1000, null);
    }
    @OnClick(R.id.fadeOut) void fadeOut(){
        AnimateUtil.fadeOut(cardView, 1000, null);
    }
}
