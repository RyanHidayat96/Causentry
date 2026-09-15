package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import androidx.collection.SieveCache;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.AndroidPreloadedFont;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated(message = "Duplicate cache")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTypefaceCache;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroidx/compose/ui/text/font/Font;", "p1", "Landroid/graphics/Typeface;", "getOrCreate", "(Landroid/content/Context;Landroidx/compose/ui/text/font/Font;)Landroid/graphics/Typeface;", "", "getKey", "(Landroid/content/Context;Landroidx/compose/ui/text/font/Font;)Ljava/lang/String;", "Landroidx/collection/SieveCache;", "cache", "Landroidx/collection/SieveCache;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidTypefaceCache {
    public static final AndroidTypefaceCache INSTANCE = new AndroidTypefaceCache();
    private static final SieveCache<String, Typeface> cache = new SieveCache<>(16, 16, null, null, null, 28, null);
    public static final int $stable = 8;

    private AndroidTypefaceCache() {
    }

    public final Typeface getOrCreate(Context p0, Font p1) {
        Typeface typefaceLoadBlocking;
        Typeface typeface;
        String key = getKey(p0, p1);
        if (key != null && (typeface = cache.get(key)) != null) {
            return typeface;
        }
        if (p1 instanceof ResourceFont) {
            if (Build.VERSION.SDK_INT >= 26) {
                typefaceLoadBlocking = AndroidResourceFontLoaderHelper.INSTANCE.create(p0, ((ResourceFont) p1).getResId());
            } else {
                typefaceLoadBlocking = ResourcesCompat.getFont(p0, ((ResourceFont) p1).getResId());
                Intrinsics.checkNotNull(typefaceLoadBlocking);
            }
        } else {
            if (!(p1 instanceof AndroidFont)) {
                throw new IllegalArgumentException("Unknown font type: ".concat(String.valueOf(p1)));
            }
            AndroidFont androidFont = (AndroidFont) p1;
            typefaceLoadBlocking = androidFont.getTypefaceLoader().loadBlocking(p0, androidFont);
        }
        if (typefaceLoadBlocking == null) {
            throw new IllegalArgumentException("Unable to load font ".concat(String.valueOf(p1)));
        }
        if (key != null) {
            cache.put(key, typefaceLoadBlocking);
        }
        return typefaceLoadBlocking;
    }

    private final String getKey(Context p0, Font p1) {
        if (p1 instanceof ResourceFont) {
            TypedValue typedValue = new TypedValue();
            p0.getResources().getValue(((ResourceFont) p1).getResId(), typedValue, true);
            StringBuilder sb = new StringBuilder("res:");
            CharSequence charSequence = typedValue.string;
            String string = charSequence != null ? charSequence.toString() : null;
            Intrinsics.checkNotNull(string);
            sb.append(string);
            return sb.toString();
        }
        if (p1 instanceof AndroidPreloadedFont) {
            return ((AndroidPreloadedFont) p1).getCacheKey();
        }
        throw new IllegalArgumentException("Unknown font type: ".concat(String.valueOf(p1)));
    }
}
