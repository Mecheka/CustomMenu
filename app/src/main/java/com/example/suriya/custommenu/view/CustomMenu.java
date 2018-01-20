package com.example.suriya.custommenu.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.suriya.custommenu.R;

/**
 * Created by Suriya on 17/1/2561.
 */

public class CustomMenu extends FrameLayout {

    private LinearLayout layout;
    private ImageView iconMenu;
    private TextView tvMenu;

    public CustomMenu(@NonNull Context context) {
        super(context);
        initInFlate();
        initInstance();
    }

    public CustomMenu(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initInFlate();
        initInstance();
    }

    public CustomMenu(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initInFlate();
        initInstance();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomMenu(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        initInFlate();
        initInstance();

    }

    private void initInFlate(){

        inflate(getContext(), R.layout.custom_menu, this);

    }

    private void initInstance(){

        layout = (LinearLayout)findViewById(R.id.layout);
        iconMenu = (ImageView)findViewById(R.id.iconMenu);
        tvMenu = (TextView)findViewById(R.id.tvMenu);

    }

    public void setIconMenu(Drawable drawable){

        iconMenu.setImageDrawable(drawable);

    }

    public void setTvMenu(String text){

        tvMenu.setText(text);

    }
}
