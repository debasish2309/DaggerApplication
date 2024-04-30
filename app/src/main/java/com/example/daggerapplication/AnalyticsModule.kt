package com.example.daggerapplication

import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import kotlin.time.measureTime

@Module
class AnalyticsModule {

    @Singleton
    @Provides
    fun getAnalyticsService() : AnalyticsService{
         return MixPanel()
    }
}