# dots
[![](https://jitpack.io/v/tizisdeepan/dots.svg)](https://jitpack.io/#tizisdeepan/dots)


Welcome to the dots wiki!

What is Dots?

Dots is a library that helps in adding a simple yet effective dots indicator for the View Pagers used in your android code. It combines the usage of observers and state drawables to indicate the current visible page's position in a badass way.

Implementation

[1] In your app module gradle file

dependencies {
    implementation 'com.github.tizisdeepan:dots:1.0.0'
}
[2] In your project level gradle file

allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
[3] Use DotsIndicator in you layout.xml

<com.make.dots.dotsindicator.DotsIndicator
    android:id="@+id/dotsIndicator"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_marginBottom="12dp"
    android:background="@drawable/dots_background"
    android:padding="6dp"
    app:dot_drawable="@drawable/ic_dot_darkgrey"
    app:dot_drawable_unselected="@drawable/ic_dot_lightgrey"
    app:dot_height="8dp"
    app:dot_margin="6dp"
    app:dot_width="8dp" />
[4] Link the View Pager with the Dots Indicator in your Java / Kotlin code

dotsIndicator.setViewPager(imageViewPager)
imageViewPager.adapter?.registerDataSetObserver(dotsIndicator.dataSetObserver)
Voila! You have implemented a simple dots indicator for your View Pager now!
