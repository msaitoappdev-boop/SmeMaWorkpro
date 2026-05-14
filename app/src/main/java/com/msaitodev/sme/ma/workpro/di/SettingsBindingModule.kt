package com.msaitodev.sme.ma.workpro.di

import com.msaitodev.feature.settings.SettingsProvider
import com.msaitodev.sme.ma.workpro.notifications.QuizSettingsProvider
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class SettingsBindingModule {

    @Binds
    @Singleton
    abstract fun bindSettingsProvider(
        impl: QuizSettingsProvider
    ): SettingsProvider
}