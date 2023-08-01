package com.zobaze.notesapp.android.di

import android.app.Application
import com.squareup.sqldelight.db.SqlDriver
import com.zobaze.notesapp.data.local.DatabaseDriverFactory
import com.zobaze.notesapp.data.note.SqlDelightNoteDataSource
import com.zobaze.notesapp.database.NoteDatabase
import com.zobaze.notesapp.domain.note.NoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSqlDriver(app: Application): SqlDriver {
        return DatabaseDriverFactory(app).createDriver()
    }

    @Provides
    @Singleton
    fun provideNoteDataSource(driver: SqlDriver): NoteDataSource {
        return SqlDelightNoteDataSource(NoteDatabase(driver))
    }
}