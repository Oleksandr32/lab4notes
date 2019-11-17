package com.oleksandrlysun.lab4notes.presentation.screens.di

import androidx.navigation.findNavController
import com.oleksandrlysun.lab4notes.R
import com.oleksandrlysun.lab4notes.presentation.screens.MainActivity
import com.oleksandrlysun.lab4notes.presentation.screens.MainNavigation

class MainContainer(activity: MainActivity) {

    var navigation = MainNavigation(
        activity.findNavController(R.id.root_navigation_host_fragment)
    )
}