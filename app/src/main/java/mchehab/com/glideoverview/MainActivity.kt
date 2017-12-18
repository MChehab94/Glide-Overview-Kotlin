package mchehab.com.glideoverview

import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    val IMAGE_URL = "https://www.w3schools.com/w3css/img_lights.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Glide.with(this)
                .load(IMAGE_URL)
                .into(imageView)
    }
}