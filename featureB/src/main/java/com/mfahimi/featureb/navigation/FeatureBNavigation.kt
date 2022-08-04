package com.mfahimi.featureb.navigation

import com.mfahimi.featureb.FeatureBFragmentDirections
import com.mfahimi.navigation.command.Navigation
import com.mfahimi.navigation.command.NavigationCommand


sealed class FeatureBNavigation(override val navigationCommand: NavigationCommand) :
    Navigation {

    class ToRegister(input: String) : FeatureBNavigation(
        NavigationCommand.To(
            FeatureBFragmentDirections.featureBToRegister(input)
        )
    )

}