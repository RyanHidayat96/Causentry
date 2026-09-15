package com.bpjstku.util.liveness.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/bpjstku/util/liveness/utils/AutoFitSurfaceView;", "Landroid/view/SurfaceView;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "", "p2", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "setAspectRatio", "(II)V", "onMeasure", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "F", "b", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AutoFitSurfaceView extends SurfaceView {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private float b;

    public /* synthetic */ AutoFitSurfaceView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoFitSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setAspectRatio(int p0, int p1) {
        if (p0 <= 0 || p1 <= 0) {
            throw new IllegalArgumentException("Size cannot be negative".toString());
        }
        this.b = p0 / p1;
        getHolder().setFixedSize(p0, p1);
        requestLayout();
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onMeasure(int p0, int p1) {
        super.onMeasure(p0, p1);
        int size = View.MeasureSpec.getSize(p0);
        int size2 = View.MeasureSpec.getSize(p1);
        float f = this.b;
        if (f == 0.0f) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (size <= size2) {
            f = 1.0f / f;
        }
        float f2 = size;
        float f3 = size2 * f;
        if (f2 < f3) {
            size = MathKt.roundToInt(f3);
        } else {
            size2 = MathKt.roundToInt(f2 / f);
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoFitSurfaceView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoFitSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
