package com.mfahimi.multimodulenavigation.navigation

import com.mfahimi.multimodulenavigation.fragment.HomeFragmentDirections
import com.mfahimi.navigation.args.featureb.FeatureBFragmentArg
import com.mfahimi.navigation.command.Navigation
import com.mfahimi.navigation.command.NavigationCommand


sealed class HomeNavigation(override val navigationCommand: NavigationCommand) :
    Navigation {

    class ToFeatureB(id: Long, name: String) : HomeNavigation(
        NavigationCommand.To(
            HomeFragmentDirections.homeToFeatureB(FeatureBFragmentArg(id,name))
        )
    )

}