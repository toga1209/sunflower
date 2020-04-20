package com.google.samples.apps.sunflower.utilities

fun getDummy(param: Int) = when (param) {
    in 0..20 -> 1
    in 21..40 -> 2
    else -> -1 
}
