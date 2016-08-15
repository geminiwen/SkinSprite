package xyz.geminiwen.skinsprite.view;

/**
 * Created by geminiwen on 16/6/15.
 */
public interface Skinnable {
    /**
     * called by activity when UiMode changed
     */
    void applyDayNight();

    /**
     * indicate that if it can be changed by {@link xyz.geminiwen.skinsprite.app.SkinnableActivity}
     * @return true if it works
     */
    boolean isSkinnable();

    void setSkinnable(boolean skinnable);
}
