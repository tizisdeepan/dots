package com.make.dots

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.image_item.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagesList: ArrayList<Int> = ArrayList()
        imagesList.add(R.drawable.one)
        imagesList.add(R.drawable.two)
        imagesList.add(R.drawable.three)
        imagesList.add(R.drawable.four)
        imagesList.add(R.drawable.five)

        imageViewPager.adapter = ImagesAdapter(imagesList)
        dotsIndicator.setViewPager(imageViewPager)
        imageViewPager.adapter?.registerDataSetObserver(dotsIndicator.dataSetObserver)
    }

    class ImagesAdapter(val media: ArrayList<Int>) : PagerAdapter() {

        override fun isViewFromObject(view: View, `object`: Any): Boolean = view == `object` as View

        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            val ctx = container.context
            val view = (ctx as MainActivity).layoutInflater.inflate(R.layout.image_item, container, false)
            view.imageView.setImageResource(media[position])
            container.addView(view)
            return view
        }

        override fun getCount(): Int = media.size

        override fun getItemPosition(`object`: Any): Int = super.getItemPosition(`object`)

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            container.removeView(`object` as View)
        }
    }
}
