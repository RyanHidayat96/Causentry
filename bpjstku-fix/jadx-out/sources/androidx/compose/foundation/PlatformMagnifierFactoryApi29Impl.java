package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00068\u0017X\u0097D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "<init>", "()V", "Landroid/view/View;", "p0", "", "p1", "Landroidx/compose/ui/unit/DpSize;", "p2", "Landroidx/compose/ui/unit/Dp;", "p3", "p4", "p5", "Landroidx/compose/ui/unit/Density;", "p6", "", "p7", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "create-nHHXs2Y", "(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/Density;F)Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "create", "canUpdateZoom", "Z", "getCanUpdateZoom", "()Z", "PlatformMagnifierImpl"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {
    public static final int $stable = 0;
    public static final PlatformMagnifierFactoryApi29Impl INSTANCE = new PlatformMagnifierFactoryApi29Impl();
    private static final boolean canUpdateZoom = true;

    private PlatformMagnifierFactoryApi29Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public final boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    /* JADX INFO: renamed from: create-nHHXs2Y */
    public final PlatformMagnifierImpl mo648createnHHXs2Y(View p0, boolean p1, long p2, float p3, float p4, boolean p5, Density p6, float p7) {
        if (p1) {
            return new PlatformMagnifierImpl(new Magnifier(p0));
        }
        long jMo695toSizeXkaWNTQ = p6.mo695toSizeXkaWNTQ(p2);
        float fMo694toPx0680j_4 = p6.mo694toPx0680j_4(p3);
        float fMo694toPx0680j_5 = p6.mo694toPx0680j_4(p4);
        Magnifier.Builder builder = new Magnifier.Builder(p0);
        if (jMo695toSizeXkaWNTQ != InlineClassHelperKt.UnspecifiedPackedFloats) {
            builder.setSize(MathKt.roundToInt(Size.m4043getWidthimpl(jMo695toSizeXkaWNTQ)), MathKt.roundToInt(Size.m4040getHeightimpl(jMo695toSizeXkaWNTQ)));
        }
        if (!Float.isNaN(fMo694toPx0680j_4)) {
            builder.setCornerRadius(fMo694toPx0680j_4);
        }
        if (!Float.isNaN(fMo694toPx0680j_5)) {
            builder.setElevation(fMo694toPx0680j_5);
        }
        if (!Float.isNaN(p7)) {
            builder.setInitialZoom(p7);
        }
        builder.setClippingEnabled(p5);
        return new PlatformMagnifierImpl(builder.build());
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "Landroid/widget/Magnifier;", "p0", "<init>", "(Landroid/widget/Magnifier;)V", "Landroidx/compose/ui/geometry/Offset;", "p1", "", "p2", "", "update-Wko1d7g", "(JJF)V", "update"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public static final int $stable = 0;

        public PlatformMagnifierImpl(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl, androidx.compose.foundation.PlatformMagnifier
        /* JADX INFO: renamed from: update-Wko1d7g */
        public final void mo647updateWko1d7g(long p0, long p1, float p2) {
            if (!Float.isNaN(p2)) {
                getMagnifier().setZoom(p2);
            }
            if (OffsetKt.m3993isSpecifiedk4lQ0M(p1)) {
                getMagnifier().show(Offset.m3974getXimpl(p0), Offset.m3975getYimpl(p0), Offset.m3974getXimpl(p1), Offset.m3975getYimpl(p1));
            } else {
                getMagnifier().show(Offset.m3974getXimpl(p0), Offset.m3975getYimpl(p0));
            }
        }
    }
}
