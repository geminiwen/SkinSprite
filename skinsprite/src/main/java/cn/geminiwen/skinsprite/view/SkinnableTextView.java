package cn.geminiwen.skinsprite.view;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by geminiwen on 16/6/15.
 */
public class SkinnableTextView extends AppCompatTextView implements Skinnable {

    private AttributeSet mAttributeSet;

    public SkinnableTextView(Context context) {
        this(context, null);
    }

    public SkinnableTextView(Context context, AttributeSet attrs) {
        this(context, attrs, android.R.attr.textViewStyle);
    }

    public SkinnableTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mAttributeSet = attrs;
    }
}
