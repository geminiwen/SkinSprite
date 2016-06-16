package cn.geminiwen.skinsprite.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;

import cn.geminiwen.skinsprite.R;

/**
 * Created by geminiwen on 16/6/16.
 */
public class SkinnableToolbar extends Toolbar implements Skinnable {
    private AttrsHelper mAttrsHelper;

    public SkinnableToolbar(Context context) {
        this(context, null);
    }

    public SkinnableToolbar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, android.support.v7.appcompat.R.attr.toolbarStyle);
    }

    public SkinnableToolbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mAttrsHelper = new AttrsHelper();

        TypedArray a;

        a = context.obtainStyledAttributes(attrs,
                R.styleable.SkinnableView,
                defStyleAttr, 0);
        mAttrsHelper.storeAttributeResource(a, R.styleable.SkinnableView);
        a.recycle();

        a = context.obtainStyledAttributes(attrs,
                R.styleable.Toolbar,
                defStyleAttr, 0);
        mAttrsHelper.storeAttributeResource(a, R.styleable.Toolbar);
        a.recycle();
    }

    @Override
    public void applyDayNight() {
        Context context = getContext();
        int key;

        key = R.styleable.SkinnableView[R.styleable.SkinnableView_android_background];
        Integer backgroundResource = mAttrsHelper.getAttributeResource(key);
        if (backgroundResource != null) {
            Drawable background = ContextCompat.getDrawable(context, backgroundResource);
            if (Build.VERSION.SDK_INT < 16) {
                setBackgroundDrawable(background);
            } else {
                setBackground(background);
            }
        }

        key = R.styleable.Toolbar[R.styleable.Toolbar_titleTextAppearance];
        Integer titleTextAppearance = mAttrsHelper.getAttributeResource(key);
        if (titleTextAppearance != null) {
            setTitleTextAppearance(context, titleTextAppearance);
        }

        key = R.styleable.Toolbar[R.styleable.Toolbar_subtitleTextAppearance];
        Integer subTitleTextAppearance = mAttrsHelper.getAttributeResource(key);
        if (titleTextAppearance != null) {
            setSubtitleTextAppearance(context, subTitleTextAppearance);
        }
    }

    @Override
    public boolean isSkinnable() {
        return true;
    }

    @Override
    public void setSkinnable(boolean skinnable) {
    }
}
