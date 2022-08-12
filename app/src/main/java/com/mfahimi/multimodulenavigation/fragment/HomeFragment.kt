package com.mfahimi.multimodulenavigation.fragment

import android.os.Bundle
import android.view.View
import com.mfahimi.core.BaseFragment
import com.mfahimi.multimodulenavigation.R
import com.mfahimi.multimodulenavigation.navigation.HomeNavigation
import com.mfahimi.navigation.command.DeepLinkNavigation


class HomeFragment : BaseFragment() {
    override val layoutResId: Int = R.layout.fragment_home

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.btn).setOnClickListener { navigateToFeatureB() }
        view.findViewById<View>(R.id.btn2).setOnClickListener { navigateToRegister() }

    }

    private fun navigateToFeatureB() {
        navigate(HomeNavigation.ToFeatureB(123, "Mohammad"))
    }

    private fun navigateToRegister() {
        navigate(DeepLinkNavigation.ToRegister("mfahimi"))
    }
}