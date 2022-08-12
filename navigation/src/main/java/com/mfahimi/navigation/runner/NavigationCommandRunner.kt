package com.mfahimi.navigation.runner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import com.mfahimi.navigation.command.NavigationCommand


class NavigationCommandRunner(
    private val activity: AppCompatActivity,
    private val navController: NavController
) {

    fun run(command: NavigationCommand) {
        when (command) {
            is NavigationCommand.To -> navigateTo(command)
            is NavigationCommand.Back -> navigateBack(command)
            is NavigationCommand.DeepLink -> navigateDeepLink(command)
            is NavigationCommand.ViaCommand -> navigateCommand(command)
            is NavigationCommand.Custom -> navigateCustom(command)
        }
    }

    private fun navigateTo(command: NavigationCommand.To) {

        if (command.extras == null) {
            navController.navigate(command.directions)
        } else {
            navController.navigate(command.directions, command.extras)
        }
    }

    private fun navigateBack(command: NavigationCommand.Back) {
        val destinationId: Int? = command.destinationId
        val inclusive: Boolean = command.inclusive

        val wasPopped = if (destinationId != null)
            navController.popBackStack(destinationId, inclusive)
        else
            navController.popBackStack()

        if (!wasPopped)
            activity.finish()
    }

    private fun navigateDeepLink(command: NavigationCommand.DeepLink) {
        navController.createDeepLink()
            .setDestination(command.destinationId)
            .setArguments(command.args?.bundlify())
            .createPendingIntent()
            .send()
    }

    private fun navigateCommand(command: NavigationCommand.ViaCommand) {
        command.command.execute(activity)
    }

    private fun navigateCustom(command: NavigationCommand.Custom) {
        for (subCommand in command.commands) {
            run(subCommand)
        }
    }

    private fun Map<String, String>.bundlify(): Bundle {
        val bundle = Bundle()
        for (entry in this) { bundle.putString(entry.key, entry.value) }
        return bundle
    }

}
