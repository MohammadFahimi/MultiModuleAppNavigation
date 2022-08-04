package com.mfahimi.navigation.params.login

import android.os.Bundle
import androidx.core.os.bundleOf

object LoginFragmentParams {
    private const val USER_NAME = "user_name"

    fun createBundle(userName: String): Bundle {
        return bundleOf(USER_NAME to userName)
    }
}

object RegisterFragmentParams {
    private const val DESCRIPTION = "input"

    fun createBundle(description: String): Bundle {
        return bundleOf(DESCRIPTION to description)
    }
}