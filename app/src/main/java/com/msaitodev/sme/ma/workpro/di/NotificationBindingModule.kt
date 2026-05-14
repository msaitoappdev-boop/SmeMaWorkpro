package com.msaitodev.sme.ma.workpro.di

import com.msaitodev.core.notifications.NotificationPolicy
import com.msaitodev.sme.ma.workpro.notifications.QuizNotificationPolicy
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NotificationBindingModule {

    @Binds
    @Singleton
    abstract fun bindNotificationPolicy(
        impl: QuizNotificationPolicy
    ): NotificationPolicy
}