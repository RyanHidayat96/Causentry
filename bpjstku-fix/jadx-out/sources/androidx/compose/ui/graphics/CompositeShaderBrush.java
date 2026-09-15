package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\r\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0002\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0014"}, d2 = {"Landroidx/compose/ui/graphics/CompositeShaderBrush;", "Landroidx/compose/ui/graphics/ShaderBrush;", "p0", "p1", "Landroidx/compose/ui/graphics/BlendMode;", "p2", "<init>", "(Landroidx/compose/ui/graphics/ShaderBrush;Landroidx/compose/ui/graphics/ShaderBrush;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Size;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "dstBrush", "Landroidx/compose/ui/graphics/ShaderBrush;", "getDstBrush", "()Landroidx/compose/ui/graphics/ShaderBrush;", "srcBrush", "getSrcBrush", "blendMode", "I", "getBlendMode-0nO6VwU"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompositeShaderBrush extends ShaderBrush {
    private final int blendMode;
    private final ShaderBrush dstBrush;
    private final ShaderBrush srcBrush;

    public final ShaderBrush getDstBrush() {
        return this.dstBrush;
    }

    public final ShaderBrush getSrcBrush() {
        return this.srcBrush;
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name and from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    private CompositeShaderBrush(ShaderBrush shaderBrush, ShaderBrush shaderBrush2, int i) {
        this.dstBrush = shaderBrush;
        this.srcBrush = shaderBrush2;
        this.blendMode = i;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public final Shader mo4187createShaderuvyYCjk(long p0) {
        return ShaderKt.m4546CompositeShader7EN7VTw(this.dstBrush.mo4187createShaderuvyYCjk(p0), this.srcBrush.mo4187createShaderuvyYCjk(p0), this.blendMode);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CompositeShaderBrush)) {
            return false;
        }
        CompositeShaderBrush compositeShaderBrush = (CompositeShaderBrush) p0;
        return Intrinsics.areEqual(this.dstBrush, compositeShaderBrush.dstBrush) && Intrinsics.areEqual(this.srcBrush, compositeShaderBrush.srcBrush) && BlendMode.m4128equalsimpl0(this.blendMode, compositeShaderBrush.blendMode);
    }

    public final int hashCode() {
        return (((this.dstBrush.hashCode() * 31) + this.srcBrush.hashCode()) * 31) + BlendMode.m4129hashCodeimpl(this.blendMode);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompositeShaderBrush(dstBrush=");
        sb.append(this.dstBrush);
        sb.append(", srcBrush=");
        sb.append(this.srcBrush);
        sb.append(", blendMode=");
        sb.append((Object) BlendMode.m4130toStringimpl(this.blendMode));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ CompositeShaderBrush(ShaderBrush shaderBrush, ShaderBrush shaderBrush2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(shaderBrush, shaderBrush2, i);
    }
}
