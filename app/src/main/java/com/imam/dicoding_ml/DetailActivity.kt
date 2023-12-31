package com.imam.dicoding_ml

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_ROLE = "extra_role"
        const val EXTRA_NICKNAME = "extra_nickname"
        const val EXTRA_INTRO = "extra_intro"
        const val EXTRA_PIC = "extra_pic"
        const val EXTRA_PICBG = "extra_picbg"
        const val EXTRA_ELEMENT = "extra_element"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvCharName: TextView = findViewById(R.id.char_name)
        val tvCharRole: TextView = findViewById(R.id.char_role)
        val tvCharIntro: TextView = findViewById(R.id.char_bio)
        val imgCharPic: ImageView = findViewById(R.id.char_pic)
        val imgCharPicbg: ImageView = findViewById(R.id.char_bg)
        val imgCharElement: ImageView = findViewById(R.id.char_element)
        val favButton: ImageView = findViewById(R.id.fav_button)
        val shareButton: Button = findViewById(R.id.share_button)
        var fav = false

        val charName = intent.getStringExtra(EXTRA_NAME)
        val charRole = intent.getStringExtra(EXTRA_ROLE)
        val charIntro = intent.getStringExtra(EXTRA_INTRO)
        val charPic = intent.getIntExtra(EXTRA_PIC, 0)
        val charPicbg = intent.getIntExtra(EXTRA_PICBG, 0)
        val charElement = intent.getIntExtra(EXTRA_ELEMENT, 0)

        tvCharName.text = charName
        tvCharRole  .text = charRole
        tvCharIntro.text = charIntro
        Glide.with(this)
            .load(charPic)
            .apply(RequestOptions())
            .into(imgCharPic)
        Glide.with(this)
            .load(charPicbg)
            .apply(RequestOptions())
            .into(imgCharPicbg)
        Glide.with(this)
            .load(charElement)
            .apply(RequestOptions())
            .into(imgCharElement)

        favButton.setOnClickListener {
            if (!fav) {
                Toast.makeText(this, "Add To Favorite", Toast.LENGTH_SHORT).show()
                favButton.setImageResource(R.drawable.ic_baseline_favorite_24)
                fav = true
            } else {
                Toast.makeText(this, "Remove From Favorite", Toast.LENGTH_SHORT).show()
                favButton.setImageResource(R.drawable.ic_baseline_favorite_border_24)
                fav = false
            }
        }

        shareButton.setOnClickListener {
            val goShare = Intent()
            goShare.action = Intent.ACTION_SEND
            goShare.putExtra(Intent.EXTRA_TEXT, "Hey look at this Mobile Legend Character: ")
            goShare.type = "text/plain"
            startActivity(Intent.createChooser(goShare, "Share To:"))
        }
    }
}