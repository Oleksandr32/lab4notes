package com.oleksandrlysun.lab4notes.presentation.screens.signup.di

import com.oleksandrlysun.lab4notes.Lab4NotesApplication
import com.oleksandrlysun.lab4notes.presentation.screens.signup.SignUpFragment
import com.oleksandrlysun.lab4notes.presentation.screens.signup.SignUpPresenter
import com.oleksandrlysun.lab4notes.presentation.utils.FragmentInjector

class SignUpFragmentInjector : FragmentInjector<SignUpFragment> {

    override fun inject(fragment: SignUpFragment) {
        val appContainer = (fragment.activity!!.application as Lab4NotesApplication).appContainer
        fragment.presenter = SignUpPresenter()
    }
}