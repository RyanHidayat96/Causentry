package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/graphics/BlendModeColorFilterHelper;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "p0", "Landroidx/compose/ui/graphics/BlendMode;", "p1", "Landroid/graphics/BlendModeColorFilter;", "BlendModeColorFilter-xETnrds", "(JI)Landroid/graphics/BlendModeColorFilter;", "BlendModeColorFilter", "Landroidx/compose/ui/graphics/BlendModeColorFilter;", "createBlendModeColorFilter", "(Landroid/graphics/BlendModeColorFilter;)Landroidx/compose/ui/graphics/BlendModeColorFilter;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BlendModeColorFilterHelper {
    public static final BlendModeColorFilterHelper INSTANCE = new BlendModeColorFilterHelper();

    private BlendModeColorFilterHelper() {
    }

    /* JADX INFO: renamed from: BlendModeColorFilter-xETnrds, reason: not valid java name */
    public final android.graphics.BlendModeColorFilter m4163BlendModeColorFilterxETnrds(long p0, int p1) {
        return new android.graphics.BlendModeColorFilter(ColorKt.m4272toArgb8_81llA(p0), AndroidBlendMode_androidKt.m4066toAndroidBlendModes9anfk8(p1));
    }

    public final BlendModeColorFilter createBlendModeColorFilter(android.graphics.BlendModeColorFilter p0) {
        return new BlendModeColorFilter(ColorKt.Color(p0.getColor()), AndroidBlendMode_androidKt.toComposeBlendMode(p0.getMode()), p0, null);
    }
}
