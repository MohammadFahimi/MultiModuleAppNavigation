package com.mfahimi.login

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.mfahimi.core.BaseFragment
import com.mfahimi.login.navigation.LoginNavigation


class LoginFragment : BaseFragment() {
    override val layoutResId: Int = R.layout.fragment_login
    private val args: LoginFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.txt).text = args.userName
        view.findViewById<View>(R.id.btn).setOnClickListener {
            navigateToRegister()
        }
    }

    private fun navigateToRegister() {
        navigate(LoginNavigation.ToRegister("navigate inside login module"))
//        navigate(LoginNavigation.ToRegisterViaId("navigate inside login module without safeArg"))
    }
}