package com.oleksandrlysun.lab4notes.presentation.screens.signin

import com.oleksandrlysun.lab4notes.presentation.screens.MainNavigation

class SignInPresenter(private val navigation: MainNavigation) {

    fun signUp() {
        navigation.signInToSignUp()
    }

    fun skipSignIn() {
        navigation.signInToNotes()
    }

    fun signIn(username: String, password: String) {

    }
}