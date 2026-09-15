package defpackage;

import android.os.SystemClock;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactorKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class getOptionsList extends Painter {
    private final ContentScale TuitionPaymentFragmentbindingInflater1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Painter TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final boolean asInterface;
    private final boolean b;
    private boolean d;
    private Painter g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MutableIntState f960a = SnapshotIntStateKt.mutableIntStateOf(0);
    private long cancel = -1;
    private final MutableFloatState asBinder = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
    private final MutableState TuitionPaymentFragmentspecialinlinedviewModeldefault2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public getOptionsList(Painter painter, Painter painter2, ContentScale contentScale, int i, boolean z, boolean z2) {
        this.g = painter;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = painter2;
        this.TuitionPaymentFragmentbindingInflater1 = contentScale;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        this.b = z;
        this.asInterface = z2;
    }

    private final int TuitionPaymentFragmentbindingInflater1() {
        return this.f960a.getIntValue();
    }

    private final void b(int i) {
        this.f960a.setIntValue(i);
    }

    private final float TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.asBinder.getFloatValue();
    }

    private final ColorFilter TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return (ColorFilter) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        return b();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        if (this.d) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(drawScope, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.cancel == -1) {
            this.cancel = jUptimeMillis;
        }
        float f = (jUptimeMillis - this.cancel) / this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        float fCoerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f) * TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        float fTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.b ? TuitionPaymentFragmentspecialinlinedviewModeldefault3() - fCoerceIn : TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.d = f >= 1.0f;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(drawScope, this.g, fTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(drawScope, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, fCoerceIn);
        if (this.d) {
            this.g = null;
        } else {
            b(TuitionPaymentFragmentbindingInflater1() + 1);
        }
    }

    private final long b() {
        Painter painter = this.g;
        long intrinsicSize = painter != null ? painter.getIntrinsicSize() : Size.INSTANCE.m4052getZeroNHjbRc();
        Painter painter2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long intrinsicSize2 = painter2 != null ? painter2.getIntrinsicSize() : Size.INSTANCE.m4052getZeroNHjbRc();
        boolean z = intrinsicSize != Size.INSTANCE.m4051getUnspecifiedNHjbRc();
        boolean z2 = intrinsicSize2 != Size.INSTANCE.m4051getUnspecifiedNHjbRc();
        if (z && z2) {
            return SizeKt.Size(Math.max(Size.m4043getWidthimpl(intrinsicSize), Size.m4043getWidthimpl(intrinsicSize2)), Math.max(Size.m4040getHeightimpl(intrinsicSize), Size.m4040getHeightimpl(intrinsicSize2)));
        }
        if (this.asInterface) {
            if (z) {
                return intrinsicSize;
            }
            if (z2) {
                return intrinsicSize2;
            }
        }
        return Size.INSTANCE.m4051getUnspecifiedNHjbRc();
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(DrawScope drawScope, Painter painter, float f) {
        if (painter == null || f <= 0.0f) {
            return;
        }
        long jMo4798getSizeNHjbRc = drawScope.mo4798getSizeNHjbRc();
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(painter.getIntrinsicSize(), jMo4798getSizeNHjbRc);
        if (jMo4798getSizeNHjbRc == Size.INSTANCE.m4051getUnspecifiedNHjbRc() || Size.m4045isEmptyimpl(jMo4798getSizeNHjbRc)) {
            painter.m4923drawx_KDEd0(drawScope, jTuitionPaymentFragmentspecialinlinedviewModeldefault1, f, TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            return;
        }
        float fM4043getWidthimpl = (Size.m4043getWidthimpl(jMo4798getSizeNHjbRc) - Size.m4043getWidthimpl(jTuitionPaymentFragmentspecialinlinedviewModeldefault1)) / 2.0f;
        float fM4040getHeightimpl = (Size.m4040getHeightimpl(jMo4798getSizeNHjbRc) - Size.m4040getHeightimpl(jTuitionPaymentFragmentspecialinlinedviewModeldefault1)) / 2.0f;
        drawScope.getDrawContext().getTransform().inset(fM4043getWidthimpl, fM4040getHeightimpl, fM4043getWidthimpl, fM4040getHeightimpl);
        painter.m4923drawx_KDEd0(drawScope, jTuitionPaymentFragmentspecialinlinedviewModeldefault1, f, TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        float f2 = -fM4043getWidthimpl;
        float f3 = -fM4040getHeightimpl;
        drawScope.getDrawContext().getTransform().inset(f2, f3, f2, f3);
    }

    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, long j2) {
        return (j == Size.INSTANCE.m4051getUnspecifiedNHjbRc() || Size.m4045isEmptyimpl(j) || j2 == Size.INSTANCE.m4051getUnspecifiedNHjbRc() || Size.m4045isEmptyimpl(j2)) ? j2 : ScaleFactorKt.m5742timesUQTWf7w(j, this.TuitionPaymentFragmentbindingInflater1.mo5630computeScaleFactorH7hwNQA(j, j2));
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.asBinder.setFloatValue(f);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(colorFilter);
        return true;
    }
}
