package com.oleksandrlysun.lab4notes.presentation.screens.signin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.oleksandrlysun.lab4notes.R
import com.oleksandrlysun.lab4notes.presentation.screens.signin.di.SignInFragmentInjector
import kotlinx.android.synthetic.main.fragment_sign_in.*

class SignInFragment : Fragment(), SignInView {

    lateinit var presenter: SignInPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        SignInFragmentInjector().inject(this)
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        signUpButton.setOnClickListener { presenter.signUp() }
        skipButton.setOnClickListener { presenter.skipSignIn() }
        signInButton.setOnClickListener {
            presenter.signIn(usernameEditText.text.toString(), passwordEditText.text.toString())
        }
    }
}