package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u00012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/graphics/ShaderBrush;", "toShaderBrush", "(Landroidx/compose/ui/graphics/Brush;)Landroidx/compose/ui/graphics/ShaderBrush;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "p0", "ShaderBrush", "(Landroid/graphics/Shader;)Landroidx/compose/ui/graphics/ShaderBrush;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BrushKt {
    public static final ShaderBrush toShaderBrush(Brush brush) {
        if (brush instanceof ShaderBrush) {
            return (ShaderBrush) brush;
        }
        if (!(brush instanceof SolidColor)) {
            throw new NoWhenBranchMatchedException();
        }
        SolidColor solidColor = (SolidColor) brush;
        Brush brushM4174verticalGradient8A3gB4$default = Brush.Companion.m4174verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m4208boximpl(solidColor.getValue()), Color.m4208boximpl(solidColor.getValue())}), 0.0f, 0.0f, 0, 14, (Object) null);
        Intrinsics.checkNotNull(brushM4174verticalGradient8A3gB4$default, "");
        return (ShaderBrush) brushM4174verticalGradient8A3gB4$default;
    }

    public static final ShaderBrush ShaderBrush(final Shader shader) {
        return new ShaderBrush() { // from class: androidx.compose.ui.graphics.BrushKt.ShaderBrush.1
            @Override // androidx.compose.ui.graphics.ShaderBrush
            /* JADX INFO: renamed from: createShader-uvyYCjk, reason: not valid java name */
            public final Shader mo4187createShaderuvyYCjk(long p0) {
                return shader;
            }
        };
    }
}
