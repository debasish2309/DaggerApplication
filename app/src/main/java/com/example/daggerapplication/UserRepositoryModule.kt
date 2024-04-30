package com.example.daggerapplication

import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * If dagger can create tis own dependency like @Inject in sql the we go for bind
 * If dagger cannot create by its ows i.e from 3rd party library or other we use provides
 */
//@Module
//class UserRepositoryModule {
//
//    @Provides
//    fun getFirebaseModule() : UserRepository {
//        return FirebaseRepository()
//    }
//}

@Module
 abstract class UserRepositoryModule {

     @Binds
     @ActivityScope
     abstract fun getSqlRepository(sqlRepository: SqlRepository): UserRepository
 }