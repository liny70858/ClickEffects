package com.liam.clickEffects.bloom;


import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.BounceInterpolator;

import com.liam.clickEffects.bloom.listener.BloomListener;


/**
 * @author SamLeung
 * @e-mail samlssplus@gmail.com
 * @github https://github.com/samlss
 * @description Bloom listener...
 */
public class DefaultBloomListener implements BloomListener {
    private View mTarget;

    public DefaultBloomListener(View target){
        mTarget = target;
    }

    @Override
    public void onBegin() {
        mTarget.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onEnd() {

        mTarget.setScaleX(0);
        mTarget.setScaleY(0);
        mTarget.setClickable(false);
        mTarget.setVisibility(View.VISIBLE);

        mTarget.animate()
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        mTarget.setClickable(true);
                    }
                })
                .scaleX(1)
                .scaleY(1)
                .setDuration(800)
                .setInterpolator(new BounceInterpolator())
                .start();
    }
}
