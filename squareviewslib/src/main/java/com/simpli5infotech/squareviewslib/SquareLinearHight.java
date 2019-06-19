package com.simpli5infotech.squareviewslib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by 5AppsInfotech on 18-11-2016.
 */

@SuppressLint("AppCompatCustomView")
public class SquareLinearHight extends LinearLayout {
    public SquareLinearHight(Context context) {
        super(context);
    }
    public SquareLinearHight(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareLinearHight(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int Actulewidth = getMeasuredHeight();
        int width =(int)(Actulewidth*(100.0f/100.0f));

        int height = width;
        setMeasuredDimension(width , height);
    }
}
