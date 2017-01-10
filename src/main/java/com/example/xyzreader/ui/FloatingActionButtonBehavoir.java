package com.example.xyzreader.ui;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Prateek on 10-01-2017.
 */
public class FloatingActionButtonBehavoir extends FloatingActionButton.Behavior{

    public FloatingActionButtonBehavoir(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
    }

    @Override
    public void onNestedScroll(CoordinatorLayout coordinatorLayout,
                               FloatingActionButton child, View target,
                               int dxConsumed, int dyConsumed,
                               int dxUnconsumed, int dyUnconsumed){
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed,dyConsumed, dxUnconsumed, dyUnconsumed);
        if(dyConsumed > 0 && child.getVisibility() == View.VISIBLE){
            child.hide();
        }else if (dyConsumed < 0 && child.getVisibility() != View.VISIBLE){
            child.show();
        }
    }
}
