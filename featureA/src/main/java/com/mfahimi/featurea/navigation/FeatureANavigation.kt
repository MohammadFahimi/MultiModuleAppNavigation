package com.mfahimi.featurea.navigation

import com.mfahimi.featurea.FeatureAFragmentDirections
import com.mfahimi.navigation.args.featureb.FeatureBFragmentArg
import com.mfahimi.navigation.command.Navigation
import com.mfahimi.navigation.command.NavigationCommand


sealed class FeatureANavigation(override val navigationCommand: NavigationCommand) :
    Navigation {
    class ToFeatureB(id: Long, name: String) : FeatureANavigation(
        NavigationCommand.To(
            FeatureAFragmentDirections.featureAToFeatureB(FeatureBFragmentArg(id, name))
        )
    )

    class ToRegister(input: String) : FeatureANavigation(
        NavigationCommand.To(
            FeatureAFragmentDirections.featureToRegister(input)
        )
    )

    class ToLogin(input: String) : FeatureANavigation(
        NavigationCommand.To(
            FeatureAFragmentDirections.featureToLogin(input)
        )
    )

}