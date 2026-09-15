package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/graphics/RenderEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "asComposeRenderEffect", "(Landroid/graphics/RenderEffect;)Landroidx/compose/ui/graphics/RenderEffect;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AndroidRenderEffect_androidKt {
    public static final RenderEffect asComposeRenderEffect(android.graphics.RenderEffect renderEffect) {
        return new AndroidRenderEffect(renderEffect);
    }
}
