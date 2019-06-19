package com.simpli5infotech.squareviewslib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by 5AppsInfotech on 18-11-2016.
 */

@SuppressLint("AppCompatCustomView")
public class SquareRelativeWidth extends RelativeLayout {
    public SquareRelativeWidth(Context context) {
        super(context);
    }
    public SquareRelativeWidth(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareRelativeWidth(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);

        int Actulewidth = getMeasuredHeight();
        int width =(int)(Actulewidth*(100.0f/100.0f));

        int height = width;
        setMeasuredDimension(width , height);
    }
}
