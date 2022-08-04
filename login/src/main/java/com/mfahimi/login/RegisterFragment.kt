package com.mfahimi.login

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.mfahimi.core.BaseFragment
import com.mfahimi.navigation.TopNavigation


class RegisterFragment : BaseFragment() {
    override val layoutResId: Int = R.layout.fragment_register
    private val args: RegisterFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.txt).text = args.input

        view.findViewById<View>(R.id.btn).setOnClickListener {
            navigate(TopNavigation.Back())
        }
    }
}