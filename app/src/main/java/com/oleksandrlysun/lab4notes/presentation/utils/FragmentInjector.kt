package com.oleksandrlysun.lab4notes.presentation.utils

import androidx.fragment.app.Fragment

interface FragmentInjector<in T : Fragment> {

    fun inject(fragment: T)
}