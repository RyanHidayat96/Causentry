package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/ui/graphics/RenderEffectVerificationHelper;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/RenderEffect;", "p0", "", "p1", "p2", "Landroidx/compose/ui/graphics/TileMode;", "p3", "Landroid/graphics/RenderEffect;", "createBlurEffect-8A-3gB4", "(Landroidx/compose/ui/graphics/RenderEffect;FFI)Landroid/graphics/RenderEffect;", "createBlurEffect", "Landroidx/compose/ui/geometry/Offset;", "createOffsetEffect-Uv8p0NA", "(Landroidx/compose/ui/graphics/RenderEffect;J)Landroid/graphics/RenderEffect;", "createOffsetEffect"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class RenderEffectVerificationHelper {
    public static final RenderEffectVerificationHelper INSTANCE = new RenderEffectVerificationHelper();

    private RenderEffectVerificationHelper() {
    }

    /* JADX INFO: renamed from: createBlurEffect-8A-3gB4, reason: not valid java name */
    public final android.graphics.RenderEffect m4541createBlurEffect8A3gB4(RenderEffect p0, float p1, float p2, int p3) {
        if (p1 == 0.0f && p2 == 0.0f) {
            return android.graphics.RenderEffect.createOffsetEffect(0.0f, 0.0f);
        }
        if (p0 == null) {
            return android.graphics.RenderEffect.createBlurEffect(p1, p2, AndroidTileMode_androidKt.m4122toAndroidTileMode0vamqd0(p3));
        }
        return android.graphics.RenderEffect.createBlurEffect(p1, p2, p0.asAndroidRenderEffect(), AndroidTileMode_androidKt.m4122toAndroidTileMode0vamqd0(p3));
    }

    /* JADX INFO: renamed from: createOffsetEffect-Uv8p0NA, reason: not valid java name */
    public final android.graphics.RenderEffect m4542createOffsetEffectUv8p0NA(RenderEffect p0, long p1) {
        if (p0 == null) {
            return android.graphics.RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (p1 >> 32)), Float.intBitsToFloat((int) (p1 & 4294967295L)));
        }
        return android.graphics.RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (p1 >> 32)), Float.intBitsToFloat((int) (p1 & 4294967295L)), p0.asAndroidRenderEffect());
    }
}
