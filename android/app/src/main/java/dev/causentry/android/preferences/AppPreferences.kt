package dev.causentry.android.preferences

import android.content.Context
import androidx.datastore.preferences.preferencesDataStore

val Context.causentryDataStore by preferencesDataStore(name = "causentry")
