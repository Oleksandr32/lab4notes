package com.oleksandrlysun.lab4notes.presentation.screens.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.oleksandrlysun.lab4notes.R
import com.oleksandrlysun.lab4notes.presentation.screens.signup.di.SignUpFragmentInjector

class SignUpFragment : Fragment() {

    lateinit var presenter: SignUpPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        SignUpFragmentInjector().inject(this)
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }
}