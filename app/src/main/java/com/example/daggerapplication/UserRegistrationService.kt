package com.example.daggerapplication

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository : UserRepository,
    @MessageQualifier private val notificationService: NotificationService
) {
    fun registerUser(email: String,password: String) {
        userRepository.saveUser(email,password)
        notificationService.send(email,"noreply@deb.com","User Registered")
    }
}