package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0001¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/Locale;", "Landroidx/compose/material3/b;", "defaultLocale", "(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ActualAndroid_androidKt {
    public static final Locale defaultLocale(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(661006346, i, -1, "androidx.compose.material3.defaultLocale (ActualAndroid.android.kt:32)");
        }
        composer.startReplaceableGroup(-273864580);
        Locale localeDefaultLocale = Locale24.INSTANCE.defaultLocale(composer, 6);
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return localeDefaultLocale;
    }
}
