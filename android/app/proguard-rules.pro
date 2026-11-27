# Hilt rules
-keep class * extends android.app.Application
-keep class * extends androidx.activity.ComponentActivity

# Keep JNI bridge classes
-keep class com.causentry.app.core.** { *; }
