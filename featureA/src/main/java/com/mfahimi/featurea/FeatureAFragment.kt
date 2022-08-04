package com.mfahimi.featurea

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.mfahimi.core.BaseFragment
import com.mfahimi.featurea.navigation.FeatureANavigation
import com.mfahimi.navigation.args.featureb.FeatureBFragmentArg
import com.mfahimi.navigation.params.login.LoginFragmentParams
import com.mfahimi.navigation.params.login.RegisterFragmentParams

class FeatureAFragment : BaseFragment() {
    override val layoutResId: Int = R.layout.fragment_feature_a

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.btn).setOnClickListener {
            navigateToLogin()
        }
        view.findViewById<View>(R.id.btn2).setOnClickListener {
            navigateToRegister()
        }
        view.findViewById<View>(R.id.btn3).setOnClickListener {
            navigateToFeatureB()
        }

    }


    private fun navigateToLogin() {
//        navigate(
//            R.id.to_login,
//            LoginFragmentParams.createBundle("From Feature A Module to login module login graph start destination")
//        )
        //OR
        navigate(FeatureANavigation.ToLogin("From Feature A Module to login module login graph start destination"))
    }

    /**
     * To navigate to another fragment of another module, if the destination fragment is not the start destination of new graph
     * we need to create another graph and make out destination fragment as it's startDestination.
     * */
    private fun navigateToRegister() {
//        navigate(
//            R.id.to_register,
//            RegisterFragmentParams.createBundle("From Feature A Module to login module register graph start destination")
//        )
        //OR
        navigate(FeatureANavigation.ToRegister("From Feature A Module to login module register graph start destination"))
    }

    private fun navigateToFeatureB() {
        navigate(FeatureANavigation.ToFeatureB(345, "your name"))
    }
}
