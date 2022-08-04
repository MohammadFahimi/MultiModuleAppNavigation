package com.mfahimi.login.navigation

import com.mfahimi.login.LoginFragmentDirections
import com.mfahimi.login.R
import com.mfahimi.navigation.command.Navigation
import com.mfahimi.navigation.command.NavigationCommand
import com.mfahimi.navigation.command.NavigationDirection
import com.mfahimi.navigation.params.login.RegisterFragmentParams


sealed class LoginNavigation(override val navigationCommand: NavigationCommand) :
    Navigation {

    class ToRegister(input: String) : LoginNavigation(
        NavigationCommand.To(
            LoginFragmentDirections.actionLoginToRegister(input)
        )
    )

    /** This kind of navigation can be used for in-module navigation or navigating to other graphs
     *  which we use id's instead of safe-arg (remove dependency to safe-arg)
     * */
    class ToRegisterViaId(input: String) : LoginNavigation(
        NavigationCommand.To(
            NavigationDirection(
                R.id.action_login_to_register,
                RegisterFragmentParams.createBundle(input)
            )
        )
    )
}