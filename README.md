# Skin Sprite
Yet another solution for change day night mode **without recreate activity**
Inspired by appcompat-v7

# How it works
When we change the UiMode, we call the `SkinnableActivity` to notify every view in the hierarchy to call `applyDayNight`
if it implements the `Skinnable` interface.

We record the resource id in view constructor when inflate it, and get current resource after apply UiMode in `applyDayNight` function.

# Preview
![preview](https://raw.githubusercontent.com/geminiwen/skin-sprite/master/art/preview.gif)

# Usage
1. Define your Night Resource in `drawable-night`/`values-night` folder etc.
2. Extends your activity with `SkinnableActivity` which extends `AppCompatActivity`
3. Call `setDayNightMode` when you want change the DayNightMode
4. Implement `Skinnable` interface when you create your own view

# Sample
See in `app` folder.

