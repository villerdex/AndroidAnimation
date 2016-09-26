package com.example.didoy.cardviews.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.Button;

import com.example.didoy.cardviews.Fragments.AnimationSetOne;
import com.example.didoy.cardviews.Fragments.AnimationSetTwo;
import com.example.didoy.cardviews.Fragments.CardBackFragment;
import com.example.didoy.cardviews.R;
import com.example.didoy.cardviews.Util.AnimateUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.card1) CardView cardView;

    @BindView(R.id.btnMenuOne) Button buttonOne;
    @BindView(R.id.btnMenu2) Button buttonTwo;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.card1) void click(){
      //  AnimateUtil.rotateY(cardView, 180f, 2000, null, true);
      //AnimateUtil.rotateX(cardView, 180f, 2000, null, true);
      //   AnimateUtil.fadeIn(cardView, 2000, null);
      //   AnimateUtil.fadeOut(cardView, 2000, null);
      // AnimateUtil.rotate(cardView, 180, 1000, null, false);
      //AnimateUtil.zoomIn(cardView, 1, 1, 1000, null);
      // AnimateUtil.zoomOut(cardView, 5, 5, 1000, null);
      //AnimateUtil.moveX(cardView, 400 , 0, 200, null);
      //AnimateUtil.moveY(cardView, 500 , 0, 200, null);
      //AnimateUtil.moveYBounce(cardView, 500 , 0, 200, null);
      //AnimateUtil.moveXBounce(cardView, 1000 , 0, 500, null);

    }

    @OnClick(R.id.btnMenuOne) void buttonMenuOneCLick(){
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new AnimationSetOne()).commit();
    }

    @OnClick(R.id.btnMenu2) void buttonMenuTwoCLick(){
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new AnimationSetTwo()).commit();

    }


}
