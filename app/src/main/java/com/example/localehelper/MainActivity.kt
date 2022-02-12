package com.example.localehelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeugmasolutions.localehelper.Locales
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle(R.string.main_activity_title)


        toARButton.setOnClickListener {
            updateLocale(Locales.Arabic)
        }

        toENButton.setOnClickListener {
            updateLocale(Locales.English)
        }

        toTRButton.setOnClickListener {
            updateLocale(Locales.Turkish)
        }

        toITButton.setOnClickListener {
            updateLocale(Locales.Italian)
        }

        toFRButton.setOnClickListener {
            updateLocale(Locales.French)
        }

    }

    override fun updateLocale(locale: Locale) {
        super.updateLocale(locale)
        setTitle(R.string.main_activity_title)
    }
}