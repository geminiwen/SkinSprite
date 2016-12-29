package xyz.geminiwen.skinsprite.demo;

import android.support.v7.app.AppCompatDelegate;

/**
 * Created by geminiwen on 16/6/16.
 */
public class Application extends android.app.Application{
    static {
        AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_YES);
    }
}
