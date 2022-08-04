package com.mfahimi.navigation

import com.mfahimi.navigation.command.Navigation
import com.mfahimi.navigation.command.NavigationCommand


sealed class TopNavigation(override val navigationCommand: NavigationCommand) :
    Navigation {

    class Back : TopNavigation(NavigationCommand.Back())

}