package com.mfahimi.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mfahimi.navigation.command.Navigation
import com.mfahimi.navigation.runner.NavigationCommandRunner

abstract class BaseFragment : Fragment() {
    abstract val layoutResId: Int
    private lateinit var navCommandRunner: NavigationCommandRunner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navCommandRunner = NavigationCommandRunner(requireActivity() as AppCompatActivity, findNavController())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(layoutResId, container, false)
    }

    fun navigate(navigation: Navigation) {
        navCommandRunner.run(navigation.navigationCommand)
    }
}