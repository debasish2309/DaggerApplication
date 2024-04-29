package com.example.daggerapplication

import dagger.Component

@Component(modules = [UserRepositoryModule::class,NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)
}