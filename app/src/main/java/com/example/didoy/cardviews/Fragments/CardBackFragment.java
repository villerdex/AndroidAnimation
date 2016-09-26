package com.example.didoy.cardviews.Fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.didoy.cardviews.R;

import butterknife.ButterKnife;

public class CardBackFragment extends android.support.v4.app.Fragment {

        public interface CardbackFragListener {

            public void tap();
        }

        private CardbackFragListener listener;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view =  inflater.inflate(R.layout.fragment_card_back, container, false);
            ButterKnife.bind(this, view);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.tap();
                }
            });

            return view;
        }

        public void setListener(CardbackFragListener cardbackFragListener){
            listener = cardbackFragListener;
        }


}
