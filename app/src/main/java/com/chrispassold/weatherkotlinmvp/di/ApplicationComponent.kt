package com.chrispassold.weatherkotlinmvp.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

//https://medium.com/@iammert/new-android-injector-with-dagger-2-part-1-8baa60152abe

@Singleton
@Component(modules = [(AndroidInjectionModule::class)])
interface ApplicationComponent {

    fun inject(application: Application)

    @Component.Builder
    interface Builder {

        fun build(): ApplicationComponent

        @BindsInstance
        fun applicationBind(application: Application): Builder

    }
}