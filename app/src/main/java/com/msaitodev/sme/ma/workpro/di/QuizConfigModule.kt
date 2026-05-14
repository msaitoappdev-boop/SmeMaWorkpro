package com.msaitodev.sme.ma.workpro.di

import com.msaitodev.core.common.config.AppAssetConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object QuizConfigModule {

    @Provides
    @Singleton
    fun provideAppAssetConfig(): AppAssetConfig {
        return AppAssetConfig(
            assetDataDirectory = "quiz_data",
            totalExamQuestions = 60, // 中小M&A資格の想定設問数（仮設定）
            passingScoreThreshold = 0.7f // 合格基準（想定7割）
        )
    }
}