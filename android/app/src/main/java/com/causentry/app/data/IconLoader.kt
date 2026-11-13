package com.causentry.app.data

import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.LruCache
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class IconLoader @Inject constructor(
    @ApplicationContext private val context: Context
) {
    // Cache up to 200 application icons in memory
    private val memoryCache = object : LruCache<String, ImageBitmap>(200) {}

    suspend fun getIcon(packageName: String): ImageBitmap? {
        // Fast path: memory cache hit
        memoryCache.get(packageName)?.let { return it }

        return withContext(Dispatchers.IO) {
            try {
                val pm = context.packageManager
                val drawable = pm.getApplicationIcon(packageName)
                val bitmap = drawableToBitmap(drawable)
                val imageBitmap = bitmap.asImageBitmap()
                memoryCache.put(packageName, imageBitmap)
                imageBitmap
            } catch (t: Throwable) {
                null
            }
        }
    }

    fun getCached(packageName: String): ImageBitmap? = memoryCache.get(packageName)

    private fun drawableToBitmap(drawable: Drawable): Bitmap {
        val width = if (drawable.intrinsicWidth > 0) drawable.intrinsicWidth else 96
        val height = if (drawable.intrinsicHeight > 0) drawable.intrinsicHeight else 96
        // Clamp size to maximum 128x128 for optimal memory usage in list
        val targetSize = minOf(maxOf(width, height), 128)
        
        val bitmap = Bitmap.createBitmap(targetSize, targetSize, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        drawable.setBounds(0, 0, canvas.width, canvas.height)
        drawable.draw(canvas)
        return bitmap
    }
}
