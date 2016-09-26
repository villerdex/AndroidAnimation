package com.example.didoy.cardviews.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.didoy.cardviews.R;

/**
 * Created by Didoy on 9/24/2016.
 */
public class CardFrontFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_card_front, container, false);
    }

}



