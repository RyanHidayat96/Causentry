package androidx.compose.ui;

import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001b\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "p0", "preferredFrameRate", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/FrameRateCategory;", "preferredFrameRate-kI47g10", "frameRate"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FrameRateKt {
    public static final Modifier preferredFrameRate(Modifier modifier, float f) {
        return ComposeUiFlags.isAdaptiveRefreshRateEnabled ? frameRate(GraphicsLayerModifierKt.m4385graphicsLayer_6ThJ44$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524287, null), f) : modifier;
    }

    /* JADX INFO: renamed from: preferredFrameRate-kI47g10, reason: not valid java name */
    public static final Modifier m3708preferredFrameRatekI47g10(Modifier modifier, float f) {
        return ComposeUiFlags.isAdaptiveRefreshRateEnabled ? frameRate(GraphicsLayerModifierKt.m4385graphicsLayer_6ThJ44$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524287, null), f) : modifier;
    }

    private static final Modifier frameRate(Modifier modifier, float f) {
        return modifier.then(new FrameRateElement(f));
    }
}
