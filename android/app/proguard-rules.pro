# Hilt rules
-keep class * extends android.app.Application
-keep class * extends androidx.activity.ComponentActivity

# Keep rust-anything JNI bridges & exception carriers
-keep class rustanything.** { *; }
-keep class com.causentry.app.core.** { *; }
