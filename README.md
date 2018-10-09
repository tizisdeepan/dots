# Dots
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![](https://jitpack.io/v/tizisdeepan/dots.svg)](https://jitpack.io/#tizisdeepan/dots)

![Screenshot 2](https://github.com/tizisdeepan/dots/raw/master/screenshots/ss_gif.gif)
## What is Dots?
Dots is a library that helps in implementing a simple yet effective dots indicator for the View Pagers used in your android code. It combines the usage of observers and state drawables to indicate the current visible page's position in a badass way.

## Implementation
### [1] In your app module gradle file

``` groovy
dependencies {
    implementation 'com.github.tizisdeepan:dots:1.0.1'
}
```

### [2] In your project level gradle file

``` groovy
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

### [3] Use DotsIndicator in your layout.xml
```xml
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
```

### [4] Link the View Pager with the Dots Indicator in your Java / Kotlin code
```kotlin
dotsIndicator.setViewPager(imageViewPager)
imageViewPager.adapter?.registerDataSetObserver(dotsIndicator.dataSetObserver)
```

## Documentation
### XML
1. `dot_drawable`: Drawable that is used to indicated the current selected page
2. `dot_drawable_unselected`: Drawable that is used to indicated the unselected pages
3. `dot_height`: Height of the Dot indicator in dp
4. `dot_width`: Width of the Dot indicator in dp
5. `dot_margin`: Marginal spaces between the Dots

### Kotlin / Java
``` kotlin
// This attaches the DotsIndicator with the ViewPager
DotsIndicator.setViewPager(ViewPager)
```

Voila! You have implemented a simple Dots indicator for your View Pager now!

Check out this medium publication: https://medium.com/@tizisdeepan/android-dots-indicator-a093d9dc3f5f

## License
This library falls under [Apache v2](https://github.com/tizisdeepan/dots/blob/master/LICENSE)
