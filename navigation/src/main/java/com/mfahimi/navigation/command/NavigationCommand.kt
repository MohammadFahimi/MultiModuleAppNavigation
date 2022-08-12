package com.mfahimi.navigation.command

import androidx.navigation.NavDirections
import androidx.navigation.fragment.FragmentNavigator


sealed class NavigationCommand {

    data class To(val directions: NavDirections, val extras: FragmentNavigator.Extras? = null) : NavigationCommand()

    data class Back(val destinationId: Int? = null, val inclusive: Boolean = false) : NavigationCommand()

    data class DeepLink(val destinationId: Int, val args: Map<String, String>? = null) : NavigationCommand()

    data class ViaCommand(val command: Command) : NavigationCommand()

    data class Custom(val commands: List<NavigationCommand>) : NavigationCommand()

}
