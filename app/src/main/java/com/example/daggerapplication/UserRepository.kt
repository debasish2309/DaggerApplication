package com.example.daggerapplication

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}
@ActivityScope
class SqlRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("TAG","User saved in DB")
        analyticsService.trackEvent("Save User","Create")
    }
}

class FirebaseRepository(val analyticsService: AnalyticsService): UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("TAG","User saved in Firebase")
        analyticsService.trackEvent("Save User","Create")
    }

}