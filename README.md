# Skin Sprite
Yet another solution for change day night mode **without recreate activity**
Inspired by appcompat-v7

## How it works
When we change the UiMode,  let `SkinnableActivity` to notify every view in the hierarchy to call `applyDayNight` function
if it implements the `Skinnable` interface.

We record the resource id in view constructor when inflating it, and get current resource after apply UiMode in `applyDayNight` function.

## Preview
![preview](https://raw.githubusercontent.com/geminiwen/skin-sprite/master/art/preview.gif)

## Usage
1. Define your Night Resource in `drawable-night`/`values-night` folder etc.
2. Extends your activity with `SkinnableActivity` which extends `AppCompatActivity`
3. Call `setDayNightMode` when you want change the DayNightMode
4. Implement `Skinnable` interface when you create your own view

## Sample
See in `app` folder.


# 中文说明
虽然好想说请忽略上面的语法错误 :P

Skin Sprite 是另一种不重启`Activity` 切换Android夜间模式的库, 只支持 Api 14以上

## 如何工作
我们把所有可以换肤的`Activity`都继承自`SkinnableActivity`, 每次需要换肤的时候就调用`setDayNightMode`函数, 它会去通知`View`层级中所有实现了`Skinnable`接口的对象.
调用他们的`applyDayNight`方法, 来切换他们的样式.

我们在`View`生成的时候, 记录下了它引用的一些资源id, 然后因为切换了`UiMode`后, 获取相同资源 id 得到的实质资源不一样的特性来完成夜间模式切换的方案.

## 如何使用
1. 定义好所有夜间模式需要使用的资源和正常模式下使用的资源, 在`res`文件夹中分别使用`drawable`, `drawable-night`, `values`, `values-night` 等文件夹进行区分.
2. 使你的`Activity`继承于 `SkinnableActivity`, 它本身是继承于`AppCompatActivity`的, 和`appcompat-v7`库深度整合.
3. 当你需要切换夜晚模式的时候, 调用`setDayNightMode`
4. 如果你需要自定义View, 请继承`Skinnable`接口, 实现里面的方法, 具体可参照库内源码.

## Demo
看本 repo 下面的`app`文件夹内的用法.