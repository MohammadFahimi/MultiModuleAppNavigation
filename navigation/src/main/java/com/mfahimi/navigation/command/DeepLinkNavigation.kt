package com.mfahimi.navigation.command

import com.mfahimi.navigation.R


sealed class DeepLinkNavigation(
    override val navigationCommand: NavigationCommand
) : Navigation {

    class ToRegister(input: String) : DeepLinkNavigation(
        NavigationCommand.DeepLink(
            R.id.register_fragment,
            mapOf("input" to input),
        )
    )

      class ToLogin(userName: String) : DeepLinkNavigation(
        NavigationCommand.DeepLink(
            R.id.fragment_login,
            mapOf("user_name" to userName)
        )
    )



}
