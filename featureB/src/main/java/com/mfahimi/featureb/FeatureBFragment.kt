package com.mfahimi.featureb

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.NavDeepLinkBuilder
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.mfahimi.core.BaseFragment
import com.mfahimi.featureb.navigation.FeatureBNavigation
import com.mfahimi.navigation.command.DeepLinkNavigation


class FeatureBFragment : BaseFragment() {
    override val layoutResId: Int = R.layout.fragment_feature_b
    private val args: FeatureBFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val argument = args.complexData
        view.findViewById<TextView>(R.id.txt).text = argument?.run { "id:${this.id} ,name: ${this.name}" }
        view.findViewById<View>(R.id.btn).setOnClickListener { navigateToRegisterViaDeeplink() }
        view.findViewById<View>(R.id.btn2).setOnClickListener { navigateToRegisterViaSafeArg() }

    }

    private fun navigateToRegisterViaDeeplink() {
        val registerInput = "From FeatureB module to Login Module (register fragment) via deeplink"
        navigate(DeepLinkNavigation.ToRegister(registerInput))
    }

    private fun navigateToRegisterViaSafeArg() {
        navigate(FeatureBNavigation.ToRegister("from FeatureB module via safe arg"))
    }
}