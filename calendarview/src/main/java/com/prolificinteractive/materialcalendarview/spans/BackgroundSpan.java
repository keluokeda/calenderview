package com.prolificinteractive.materialcalendarview.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;

/**
 * Created by zhangll on 2017/6/30.
 */

public class BackgroundSpan implements LineBackgroundSpan {
    public static final float DEFAULT_RADIUS = 3.0F;
    private final float radius;
    private final int color;

    public BackgroundSpan() {
        this.radius = 3.0F;
        this.color = 0;
    }

    public BackgroundSpan(int color) {
        this.radius = 3.0F;
        this.color = color;
    }

    public BackgroundSpan(float radius) {
        this.radius = radius;
        this.color = 0;
    }

    public BackgroundSpan(float radius, int color) {
        this.radius = radius;
        this.color = color;
    }

    public void drawBackground(Canvas canvas, Paint paint, int left, int right, int top, int baseline, int bottom, CharSequence charSequence, int start, int end, int lineNum) {
        int oldColor = paint.getColor();
        if(this.color != 0) {
            paint.setColor(this.color);
        }

        canvas.drawCircle((float)((left + right) / 2), (float)((top + bottom) / 2), this.radius, paint);
        paint.setColor(oldColor);
    }
}