package com.example.daggerapplication

import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun send(to: String, from: String,body: String)
}
class EmailService @Inject constructor() : NotificationService {

    override fun send(to: String, from: String, body: String) {
        Log.d("TAG","Email Send")
    }
}

class MessageService(private val retryAccount: Int) : NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.d("TAG","Message Send $retryAccount")
    }

}