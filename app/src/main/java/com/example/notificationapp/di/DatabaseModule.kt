package com.example.notificationapp.di

import android.app.Application
import androidx.room.Room
import com.example.data.dao.SampleDao
import com.example.data.db.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "appDatabase").build()
    }

    //임시 Dao 의존성 설정 - sampleDao/sampleEntity
    @Singleton
    @Provides
    fun provideSampleDao(appDatabase: AppDatabase): SampleDao {
        return appDatabase.sampleDao()
    }
}