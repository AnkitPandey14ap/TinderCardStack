package com.example.myapplication.cardstack.internal;

import android.view.animation.Interpolator;

import com.example.myapplication.cardstack.Direction;


public interface AnimationSetting {
    Direction getDirection();
    int getDuration();
    Interpolator getInterpolator();
}
