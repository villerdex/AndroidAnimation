package com.example.didoy.cardviews.Util;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;

/**
 * Created by Didoy on 9/25/2016.
 */
public class AnimateUtil {

    private static float origDegree = 0;
    private static float ToDegree = 0;

    public static ObjectAnimator rotateX(View v, float toDegrees, long durationMillis, Animator.AnimatorListener listener, boolean reversable) {

        origDegree = v.getRotationX();

        if (reversable){
            reverseDegree(toDegrees);

            return ofFloat(v, "rotationX", origDegree, ToDegree, durationMillis,listener);
        }else {
            return ofFloat(v, "rotationX", 0.0f, toDegrees, durationMillis,listener);
        }
    }

    public static ObjectAnimator rotateY(View v,float toDegrees,long durationMillis,Animator.AnimatorListener listener, boolean reversable) {
        origDegree = v.getRotationY();

        if (reversable){
            reverseDegree(toDegrees);

            return ofFloat(v, "rotationY", origDegree, ToDegree, durationMillis,listener);
        }else {
            return ofFloat(v, "rotationY", 0.0f, toDegrees, durationMillis,listener);
        }
    }

    public static ObjectAnimator fadeIn(View v,long durationMillis, Animator.AnimatorListener listener ) {
        return ofFloat(v, "alpha",0.0F, 1.0F, durationMillis,listener);
    }
    public static ObjectAnimator fadeOut(View v,long durationMillis,Animator.AnimatorListener listener) {
        return ofFloat(v, "alpha",1.0F, 0.0F, durationMillis,listener);
    }

    public static ObjectAnimator rotate(View v,float toDegrees,long durationMillis,Animator.AnimatorListener listener, boolean reversable) {
        origDegree = v.getRotation();

        if (reversable){
            reverseDegree(toDegrees);

            return ofFloat(v, "rotation", origDegree, ToDegree, durationMillis,listener);
        }else {
            return ofFloat(v, "rotation", 0.0f, toDegrees, durationMillis,listener);
        }
    }
    /**
     */
    public static void zoomIn(View v,float SizeX,float SizeY,long durationMillis,Animator.AnimatorListener listener) {
        scaleWidth( v, 0,  SizeX, durationMillis, null);
        scaleHeight(v, 0,  SizeY, durationMillis, null);
    }

    public static void zoomOut(View v,float SizeX,float SizeY,long durationMillis,Animator.AnimatorListener listener) {
        scaleWidth( v, SizeX,  1, durationMillis, null);
        scaleHeight(v, SizeY,  1, durationMillis, null);
    }

    public static ObjectAnimator scaleWidth(View v,float fromWidth,float toWidth,long durationMillis,Animator.AnimatorListener listener) {
        return ofFloat(v, "scaleX", fromWidth, toWidth, durationMillis,listener);
    }
    public static ObjectAnimator scaleHeight(View v,float fromHeight,float toHeight,long durationMillis,Animator.AnimatorListener listener) {
        return ofFloat(v, "scaleY", fromHeight, toHeight, durationMillis,listener);
    }
    public static ObjectAnimator moveY(View v,float fromY,float toY,long durationMillis,Animator.AnimatorListener listener) {
        return ofFloat(v, "translationY", fromY, toY, durationMillis,listener);
    }
    public static ObjectAnimator moveX(View v,float fromX, float toX,long durationMillis, Animator.AnimatorListener listener) {
            return ofFloat(v, "translationX", fromX, toX, durationMillis,listener);
    }
    public static ObjectAnimator moveYBounce(View v,float fromY,float toY,long durationMillis,Animator.AnimatorListener listener) {
        ObjectAnimator animation =ofFloat(v, "translationY", fromY, toY, durationMillis,listener);
        animation.setInterpolator(new BounceInterpolator());
        return animation;
    }
    public static ObjectAnimator moveXBounce(View v,float fromX,float toX,long durationMillis,Animator.AnimatorListener listener) {
        ObjectAnimator animation = ofFloat(v, "translationX", fromX, toX, durationMillis, listener);
        animation.setInterpolator(new BounceInterpolator());
        return animation;
    }


    public static ObjectAnimator ofFloat(View v,String propertyName,float from,float to,long durationMillis,Animator.AnimatorListener listener) {
        ObjectAnimator animation = ObjectAnimator.ofFloat(v, propertyName, from, to);
        animation.setDuration(durationMillis);
        v.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        animation.setInterpolator(new LinearInterpolator());
        if(listener != null)animation.addListener(listener);
        animation.start();
        return animation;
    }

    private static void reverseDegree(float toDegree){
        if (origDegree != 0){
            ToDegree = 0;
        }else {
            ToDegree = toDegree;
        }

    }
}
