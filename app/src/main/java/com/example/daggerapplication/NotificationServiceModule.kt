package com.example.daggerapplication

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule()  {

    @ActivityScope
    @MessageQualifier
    @Provides
    fun getMessageService(retryAccount: Int) : NotificationService {
        return MessageService(retryAccount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService {
        return emailService
    }
}