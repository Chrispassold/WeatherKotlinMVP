package com.chrispassold.weatherkotlinmvp.di

import com.chrispassold.weatherkotlinmvp.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    internal abstract fun contributeMainActivity(): MainActivity

    // Add bindings for other sub-components here
}