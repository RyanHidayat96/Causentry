# Room rules
-keep class * extends androidx.room.RoomDatabase
-dontwarn androidx.room.paging.**

# Hilt rules
-keep class * extends android.app.Application
-keep class * extends androidx.activity.ComponentActivity
-keep class * implements io.github.vova7878.** { *; }

# Compose rules are automatically bundled with compose runtime
