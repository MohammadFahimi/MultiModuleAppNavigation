package com.mfahimi.navigation.command

import androidx.core.net.toUri
import androidx.navigation.NavDeepLinkRequest


sealed class DeepLinkNavigation(
    override val navigationCommand: NavigationCommand
) : Navigation {

    class ToRegister(input: String) : DeepLinkNavigation(
        NavigationCommand.DeepLink(
            NavDeepLinkRequest.Builder
                .fromUri("https://example.com/register?input=$input".toUri())
                .build()
        )
    )

      class ToLogin(userName: String) : DeepLinkNavigation(
        NavigationCommand.DeepLink(
            NavDeepLinkRequest.Builder
                .fromUri("https://example.com/login?username=$userName".toUri())
                .build()
        )
    )



}
