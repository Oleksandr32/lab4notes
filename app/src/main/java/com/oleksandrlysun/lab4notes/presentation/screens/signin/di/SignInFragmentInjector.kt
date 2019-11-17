package com.oleksandrlysun.lab4notes.presentation.screens.signin.di

import com.oleksandrlysun.lab4notes.Lab4NotesApplication
import com.oleksandrlysun.lab4notes.presentation.screens.signin.SignInFragment
import com.oleksandrlysun.lab4notes.presentation.screens.signin.SignInPresenter
import com.oleksandrlysun.lab4notes.presentation.utils.FragmentInjector

class SignInFragmentInjector : FragmentInjector<SignInFragment> {

    override fun inject(fragment: SignInFragment) {
        val appContainer = (fragment.activity!!.application as Lab4NotesApplication).appContainer
        fragment.presenter = SignInPresenter(appContainer.mainContainer!!.navigation)
    }
}