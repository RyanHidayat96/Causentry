package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/text/platform/Api28Impl;", "", "<init>", "()V", "Landroid/graphics/Typeface;", "p0", "Landroid/text/style/TypefaceSpan;", "createTypefaceSpan", "(Landroid/graphics/Typeface;)Landroid/text/style/TypefaceSpan;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class Api28Impl {
    public static final Api28Impl INSTANCE = new Api28Impl();

    private Api28Impl() {
    }

    public final TypefaceSpan createTypefaceSpan(Typeface p0) {
        return new TypefaceSpan(p0);
    }
}
