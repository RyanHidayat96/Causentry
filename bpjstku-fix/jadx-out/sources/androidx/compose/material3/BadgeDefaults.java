package androidx.compose.material3;

import androidx.compose.material3.tokens.BadgeTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048Gø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/BadgeDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "containerColor"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BadgeDefaults {
    public static final int $stable = 0;
    public static final BadgeDefaults INSTANCE = new BadgeDefaults();

    private BadgeDefaults() {
    }

    public final long getContainerColor(Composer composer, int i) {
        composer.startReplaceableGroup(-867931977);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-867931977, i, -1, "androidx.compose.material3.BadgeDefaults.<get-containerColor> (Badge.kt:222)");
        }
        long value = ColorSchemeKt.getValue(BadgeTokens.INSTANCE.getColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }
}
