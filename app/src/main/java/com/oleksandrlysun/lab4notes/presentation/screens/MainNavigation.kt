package com.oleksandrlysun.lab4notes.presentation.screens

import androidx.navigation.NavController
import com.oleksandrlysun.lab4notes.R

class MainNavigation(private val navController: NavController) {

    fun toSignIn() {

    }

    fun signInToSignUp() {
        navController.navigate(R.id.action_signInFragment_to_signUpFragment)
    }

    fun signInToNotes() {
        navController.navigate(R.id.action_signInFragment_to_notesFragment)
    }
}