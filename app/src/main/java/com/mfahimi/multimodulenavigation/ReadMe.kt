package com.mfahimi.multimodulenavigation

/**
 * Although we can use safe args in multi module application on each module
 * but not for navigating between different module from each other.
 *
 * Android team has recommended to use deeplink for multi module but since it's not type safe and could cause
 * more issues and increase complexity
 *
 *
 * there are two ways for navigation: use navigation module with ids on top navigation module (what we have done here)
 * or just keep each module's navigation graph to itself and just navigate between them via dependency injection (interface)
 *
 *
 * problems: deeplink -> when opens deeplink and press back button
 *          navigate from featureB to register via deeplink changes bottomsheet tab wrongly
 *          which fragment will be selected when using deeplink when they are in different graph
 *          deeplink from homeFragment to register not working
 *
 * */