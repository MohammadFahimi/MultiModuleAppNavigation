package com.mfahimi.navigation.args.featureb

import androidx.annotation.Keep
import java.io.Serializable

@Keep
class FeatureBFragmentArg(
    val id: Long,
    val name: String
) : Serializable