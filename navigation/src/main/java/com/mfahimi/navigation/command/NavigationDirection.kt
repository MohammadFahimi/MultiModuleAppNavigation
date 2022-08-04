package com.mfahimi.navigation.command

import android.os.Bundle
import androidx.navigation.NavDirections


class NavigationDirection(
    override val actionId: Int,
    override val arguments: Bundle = Bundle(),
) : NavDirections
