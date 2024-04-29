package com.example.daggerapplication

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}
class SqlRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("TAG","User saved in DB")
    }
}

class FirebaseRepository: UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("TAG","User saved in Firebase")
    }

}