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
public class AnimationSetTwo extends Fragment {


    @BindView(R.id.btnZoomIn)  Button btnZoomIn;
    @BindView(R.id.btnZoomOut) Button btnZoomOut;
    @BindView(R.id.btnMoveX)   Button btnMoveX;
    @BindView(R.id.btnMoveY)   Button btnMoveY;
    @BindView(R.id.btnBounceX) Button btnBounceX;
    @BindView(R.id.btnBounceY) Button btnBounceY;

    private CardView cardView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cardView = (CardView) getActivity().findViewById(R.id.card1);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_settwo, container, false);
        ButterKnife.bind(this, v );

        return v;

    }
    @OnClick(R.id.btnZoomIn) void ZoomIn(){
        AnimateUtil.zoomIn(cardView, 1, 1, 1000, null);
    }
    @OnClick(R.id.btnZoomOut)void ZoomOut(){
        AnimateUtil.zoomOut(cardView, 5, 5, 1000, null);
    }
    @OnClick(R.id.btnMoveX)void MoveX(){
        AnimateUtil.moveX(cardView, 400 , 0, 200, null);
    }
    @OnClick(R.id.btnMoveY)void MoveY(){
        AnimateUtil.moveY(cardView, 500 , 0, 200, null);
    }
    @OnClick(R.id.btnBounceX)void BounceX(){
        AnimateUtil.moveXBounce(cardView, 1000 , 0, 500, null);
    }
    @OnClick(R.id.btnBounceY)void BounceY(){
        AnimateUtil.moveYBounce(cardView, 1000 , 0, 500, null);
    }

}
