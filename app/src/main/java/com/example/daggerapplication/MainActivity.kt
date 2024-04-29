package com.example.daggerapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        val userRepository = UserRepository()
//        val emailService = EmailService()
//
//        val userRegistrationService = UserRegistrationService(userRepository, emailService)
        val userRegistrationService = DaggerUserRegistrationComponent.builder().build().getUserRegistrationService()
        val emailService = DaggerUserRegistrationComponent.builder().build().getEmailService()
        userRegistrationService.registerUser("deb@dey.com","1111111")
        emailService.send("Deb@gmail.com","Deb@gmail.com","this is the text" )

    }
}