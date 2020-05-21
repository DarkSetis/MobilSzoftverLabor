package com.example.gamelister

import android.app.Activity
import androidx.fragment.app.Fragment

val Activity.injector: GameListerApplicationComponent
    get() {
        return (this.applicationContext as GameListerApplication).injector
    }

val Fragment.injector: GameListerApplicationComponent
    get() {
        return (this.context!!.applicationContext as GameListerApplication).injector
    }