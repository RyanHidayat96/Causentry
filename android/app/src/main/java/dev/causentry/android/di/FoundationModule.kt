package dev.causentry.android.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.causentry.android.storage.CausentryDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object FoundationModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): CausentryDatabase =
        Room.databaseBuilder(
            context,
            CausentryDatabase::class.java,
            "causentry.db",
        ).build()
}
