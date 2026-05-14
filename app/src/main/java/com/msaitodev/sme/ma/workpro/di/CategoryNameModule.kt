package com.msaitodev.sme.ma.workpro.di

import com.msaitodev.sme.ma.workpro.notifications.QuizCategoryNameProvider
import com.msaitodev.quiz.core.domain.repository.CategoryNameProvider
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class CategoryNameModule {

    @Binds
    @Singleton
    abstract fun bindCategoryNameProvider(
        impl: QuizCategoryNameProvider
    ): CategoryNameProvider
}