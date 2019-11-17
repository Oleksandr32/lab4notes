package com.oleksandrlysun.lab4notes.presentation.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oleksandrlysun.lab4notes.Lab4NotesApplication
import com.oleksandrlysun.lab4notes.R
import com.oleksandrlysun.lab4notes.di.AppContainer
import com.oleksandrlysun.lab4notes.presentation.screens.di.MainContainer

class MainActivity : AppCompatActivity() {

    private lateinit var appContainer: AppContainer

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme_NoActionBar)
        super.onCreate(savedInstanceState)
        appContainer = (application as Lab4NotesApplication).appContainer
        setContentView(R.layout.activity_main)
        appContainer.mainContainer = MainContainer(this)
    }
}
