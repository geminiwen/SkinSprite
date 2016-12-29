package xyz.geminiwen.skinsprite.view;

import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.SparseIntArray;

/**
 * Created by geminiwen on 16/6/16.
 */
public class AttrsHelper {
    private SparseIntArray mResourceMap;
    private static final int VALUE_NOT_FOUND = -1;

    public AttrsHelper() {
        this.mResourceMap = new SparseIntArray();
    }

    public void storeAttributeResource(TypedArray a, int[] styleable) {
        int size = a.getIndexCount();
        for (int index = 0; index < size; index ++) {
            int resourceId = a.getResourceId(index, VALUE_NOT_FOUND);
            int key = styleable[index];
            if (resourceId != VALUE_NOT_FOUND) {
                mResourceMap.put(key, resourceId);
            }
        }
    }

    public int getAttributeResource(int attr) {
        return mResourceMap.get(attr, VALUE_NOT_FOUND);
    }

}
