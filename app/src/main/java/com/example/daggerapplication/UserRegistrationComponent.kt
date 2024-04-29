package com.example.daggerapplication

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService(): UserRegistrationService

    fun getEmailService(): EmailService
}