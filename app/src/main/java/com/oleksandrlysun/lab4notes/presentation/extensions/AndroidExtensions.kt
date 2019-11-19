package com.oleksandrlysun.lab4notes.presentation.extensions

import androidx.fragment.app.Fragment
import com.oleksandrlysun.lab4notes.presentation.screens.MainActivity

val Fragment.mainActivity: MainActivity?
    get() = activity as? MainActivity