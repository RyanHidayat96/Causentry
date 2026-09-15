package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0002*\u00020\u0007H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0015\u001a\u00020\u000b*\u00020\u0007H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0012\u001a\u00020\u0002*\u00020\u0003H\u0017¢\u0006\u0004\b\u0010\u0010\u0005J\u0013\u0010\u0015\u001a\u00020\u000b*\u00020\u0003H\u0017¢\u0006\u0004\b\u0013\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001f\u001a\u00020\u001c*\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010!\u001a\u00020\u001b*\u00020\u001cH\u0017¢\u0006\u0004\b \u0010\u001eR\u001a\u0010&\u001a\u00020\u00038'X§\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/FontScaling;", "Landroidx/compose/ui/unit/Dp;", "", "toPx-0680j_4", "(F)F", "toPx", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "toPx--R2X_6o", "(J)F", "roundToPx--R2X_6o", "(J)I", "toDp-u2uoSUM", "(I)F", "toDp", "toSp-kPz2Gy4", "(I)J", "toSp", "(F)J", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toSize-XkaWNTQ", "(J)J", "toSize", "toDpSize-k-rfVVM", "toDpSize", "getDensity", "()F", "getDensity$annotations", "()V", "density"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Density extends FontScaling {
    float getDensity();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m6923toDpGaN1DYA(Density density, long j) {
            return Density.super.mo689toDpGaN1DYA(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m6930toSp0xMU5do(Density density, float f) {
            return Density.super.mo696toSp0xMU5do(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m6928toPx0680j_4(Density density, float f) {
            return Density.super.mo694toPx0680j_4(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m6922roundToPx0680j_4(Density density, float f) {
            return Density.super.mo688roundToPx0680j_4(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m6927toPxR2X_6o(Density density, long j) {
            return Density.super.mo693toPxR2X_6o(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m6921roundToPxR2X_6o(Density density, long j) {
            return Density.super.mo687roundToPxR2X_6o(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6925toDpu2uoSUM(Density density, int i) {
            return Density.super.mo691toDpu2uoSUM(i);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6932toSpkPz2Gy4(Density density, int i) {
            return Density.super.mo698toSpkPz2Gy4(i);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6924toDpu2uoSUM(Density density, float f) {
            return Density.super.mo690toDpu2uoSUM(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6931toSpkPz2Gy4(Density density, float f) {
            return Density.super.mo697toSpkPz2Gy4(f);
        }

        @Deprecated
        public static Rect toRect(Density density, DpRect dpRect) {
            return Density.super.toRect(dpRect);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m6929toSizeXkaWNTQ(Density density, long j) {
            return Density.super.mo695toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m6926toDpSizekrfVVM(Density density, long j) {
            return Density.super.mo692toDpSizekrfVVM(j);
        }
    }

    /* JADX INFO: renamed from: toPx-0680j_4 */
    default float mo694toPx0680j_4(float f) {
        return f * getDensity();
    }

    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    default int mo688roundToPx0680j_4(float f) {
        float fMo694toPx0680j_4 = mo694toPx0680j_4(f);
        if (Float.isInfinite(fMo694toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo694toPx0680j_4);
    }

    /* JADX INFO: renamed from: toPx--R2X_6o */
    default float mo693toPxR2X_6o(long j) {
        if (!TextUnitType.m7157equalsimpl0(TextUnit.m7128getTypeUIouoOA(j), TextUnitType.INSTANCE.m7162getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return mo694toPx0680j_4(mo689toDpGaN1DYA(j));
    }

    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    default int mo687roundToPxR2X_6o(long j) {
        return Math.round(mo693toPxR2X_6o(j));
    }

    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo691toDpu2uoSUM(int i) {
        return Dp.m6935constructorimpl(i / getDensity());
    }

    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo698toSpkPz2Gy4(int i) {
        return mo696toSp0xMU5do(mo691toDpu2uoSUM(i));
    }

    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo690toDpu2uoSUM(float f) {
        return Dp.m6935constructorimpl(f / getDensity());
    }

    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo697toSpkPz2Gy4(float f) {
        return mo696toSp0xMU5do(mo690toDpu2uoSUM(f));
    }

    default Rect toRect(DpRect dpRect) {
        return new Rect(mo694toPx0680j_4(dpRect.m7018getLeftD9Ej5fM()), mo694toPx0680j_4(dpRect.m7020getTopD9Ej5fM()), mo694toPx0680j_4(dpRect.m7019getRightD9Ej5fM()), mo694toPx0680j_4(dpRect.m7017getBottomD9Ej5fM()));
    }

    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    default long mo695toSizeXkaWNTQ(long j) {
        if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            float fMo694toPx0680j_4 = mo694toPx0680j_4(DpSize.m7033getWidthD9Ej5fM(j));
            return Size.m4034constructorimpl((((long) Float.floatToRawIntBits(mo694toPx0680j_4(DpSize.m7031getHeightD9Ej5fM(j)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMo694toPx0680j_4)) << 32));
        }
        return Size.INSTANCE.m4051getUnspecifiedNHjbRc();
    }

    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    default long mo692toDpSizekrfVVM(long j) {
        if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return DpKt.m6957DpSizeYgX7TsA(mo690toDpu2uoSUM(Float.intBitsToFloat((int) (j >> 32))), mo690toDpu2uoSUM(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return DpSize.INSTANCE.m7042getUnspecifiedMYxV2XQ();
    }
}
