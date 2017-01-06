package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Prateek on 07-01-2017.
 */

public class CustomImgView extends ImageView{

    public CustomImgView(Context context){
        super (context);
    }

    public CustomImgView(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
    }

    public CustomImgView(Context context, AttributeSet attributeSet, int defStyle){
        super(context, attributeSet, defStyle);
    }

    @Override
    public void onMeasure(int widthSpec, int heightSpec){
        int imgHeight = MeasureSpec.getSize(widthSpec) * 2/3;
        int imgHeightSpec = MeasureSpec.makeMeasureSpec(imgHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthSpec, imgHeightSpec);
    }
}
