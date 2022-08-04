package com.mfahimi.navigation.command


import androidx.appcompat.app.AppCompatActivity


interface Command {
    fun execute(context: AppCompatActivity)
}
