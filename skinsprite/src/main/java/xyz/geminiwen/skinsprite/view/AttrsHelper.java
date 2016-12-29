package xyz.geminiwen.skinsprite.view;

import android.content.res.TypedArray;
import android.util.SparseArray;

/**
 * Created by geminiwen on 16/6/16.
 */
class AttrsHelper {
    private SparseArray<Integer> mResourceMap;

    public AttrsHelper() {
        this.mResourceMap = new SparseArray<>();
    }

    public void storeAttributeResource(TypedArray a, int[] styleable) {
        int size = a.getIndexCount();
        for (int index = 0; index < size; index ++) {
            int resourceId = a.getResourceId(index, -1);
            int key = styleable[index];
            if (resourceId != -1) {
                mResourceMap.put(key, resourceId);
            }
        }
    }

    public Integer getAttributeResource(int attr) {
        return mResourceMap.get(attr);
    }

}
