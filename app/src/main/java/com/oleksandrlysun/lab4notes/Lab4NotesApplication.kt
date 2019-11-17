package com.oleksandrlysun.lab4notes

import android.app.Application
import com.oleksandrlysun.lab4notes.di.AppContainer

class Lab4NotesApplication : Application() {

    val appContainer = AppContainer(this)
}