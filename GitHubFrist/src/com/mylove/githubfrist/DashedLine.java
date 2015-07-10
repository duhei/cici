package com.mylove.githubfrist;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class DashedLine extends View{
	
	private float startX;
	private float startY;
	private float endX;
	private float endY;
	private Rect mRect;

	public DashedLine(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}
	
	public DashedLine(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
	public DashedLine(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		Paint paint = new Paint();
		paint.setStyle(Paint.Style.STROKE);
		paint.setColor(Color.DKGRAY);
		Path path = new Path();
		path.moveTo(0, 5);
		path.lineTo(760, 5);
		PathEffect effect = new DashPathEffect(new float[]{5,5,5,5}, 1);
		paint.setPathEffect(effect);
		canvas.drawPath(path, paint);
	}

}
