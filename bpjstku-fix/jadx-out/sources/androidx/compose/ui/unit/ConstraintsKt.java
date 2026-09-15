package androidx.compose.ui.unit;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0011\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0018\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b\u0010\u0010\u000f\u001a7\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\r\u001a\u0019\u0010\u0014\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0014\u001a\u00020\u0015*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0013\u001a\u001b\u0010\u0019\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001b\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001a\u0010\u0018\u001a\u001b\u0010\u001f\u001a\u00020\u001c*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a'\u0010\"\u001a\u00020\u000b*\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b \u0010!\u001a \u0010#\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b#\u0010$\u001a\u0018\u0010%\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b%\u0010\u000f\u001a\u0018\u0010&\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b&\u0010\u000f\u001a\u0018\u0010'\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b'\u0010\u000f\u001a\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b(\u0010\u000f\u001a\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b)\u0010\u000f\"\u0014\u0010*\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010-\u001a\u00020,8\u0002X\u0083T¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u0010/\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b/\u0010+\"\u0014\u00100\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b0\u0010+\"\u0014\u00101\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b1\u0010+\"\u0014\u00102\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b2\u0010+\"\u0014\u00103\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b3\u0010+\"\u0014\u00104\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b4\u0010+\"\u0014\u00105\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b5\u0010+\"\u0014\u00106\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b6\u0010+\"\u0014\u00107\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b7\u0010+\"\u0014\u00108\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b8\u0010+\"\u0014\u00109\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b9\u0010+\"\u0014\u0010:\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b:\u0010+\"\u001a\u0010;\u001a\u00020,8\u0000X\u0081T¢\u0006\f\n\u0004\b;\u0010.\u0012\u0004\b<\u0010="}, d2 = {"", "p0", "p1", "", "throwInvalidConstraintException", "(II)V", "", "throwInvalidConstraintsSizeException", "(I)Ljava/lang/Void;", "p2", "p3", "Landroidx/compose/ui/unit/Constraints;", "createConstraints", "(IIII)J", "bitsNeedForSizeUnchecked", "(I)I", "maxAllowedForSize", androidx.constraintlayout.widget.Constraints.TAG, "constrain-N9IONVI", "(JJ)J", "constrain", "Landroidx/compose/ui/unit/IntSize;", "constrain-4WqzIAM", "constrainWidth-K40F9xA", "(JI)I", "constrainWidth", "constrainHeight-K40F9xA", "constrainHeight", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "isSatisfiedBy", "offset-NN6Ew-U", "(JII)J", TypedValues.CycleType.S_WAVE_OFFSET, "addMaxWithMinimum", "(II)I", "indexToBitOffset", "bitOffsetToIndex", "minHeightOffsets", "widthMask", "heightMask", "Infinity", "I", "", "FocusMask", "J", "MinFocusBits", "MaxAllowedForMinFocusBits", "MinFocusMask", "MinNonFocusBits", "MaxAllowedForMinNonFocusBits", "MinNonFocusMask", "MaxFocusBits", "MaxAllowedForMaxFocusBits", "MaxFocusMask", "MaxNonFocusBits", "MaxAllowedForMaxNonFocusBits", "MaxNonFocusMask", "MaxDimensionsAndFocusMask", "getMaxDimensionsAndFocusMask$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConstraintsKt {
    private static final long FocusMask = 3;
    private static final int Infinity = Integer.MAX_VALUE;
    private static final int MaxAllowedForMaxFocusBits = 8190;
    private static final int MaxAllowedForMaxNonFocusBits = 262142;
    private static final int MaxAllowedForMinFocusBits = 32766;
    private static final int MaxAllowedForMinNonFocusBits = 65534;
    public static final long MaxDimensionsAndFocusMask = -8589934589L;
    private static final int MaxFocusBits = 18;
    private static final int MaxFocusMask = 262143;
    private static final int MaxNonFocusBits = 13;
    private static final int MaxNonFocusMask = 8191;
    private static final int MinFocusBits = 16;
    private static final int MinFocusMask = 65535;
    private static final int MinNonFocusBits = 15;
    private static final int MinNonFocusMask = 32767;

    private static final int addMaxWithMinimum(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    private static final int bitOffsetToIndex(int i) {
        return (i >> 1) + (i & 1);
    }

    public static final int bitsNeedForSizeUnchecked(int i) {
        if (i < MaxNonFocusMask) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < MaxFocusMask ? 18 : 255;
    }

    public static /* synthetic */ void getMaxDimensionsAndFocusMask$annotations() {
    }

    private static final int heightMask(int i) {
        return (1 << (18 - i)) - 1;
    }

    private static final int indexToBitOffset(int i) {
        return ((i & 1) << 1) + (((i & 2) >> 1) * 3);
    }

    private static final int minHeightOffsets(int i) {
        return i + 15;
    }

    private static final int widthMask(int i) {
        return (1 << (i + 13)) - 1;
    }

    public static final void throwInvalidConstraintException(int i, int i2) {
        StringBuilder sb = new StringBuilder("Can't represent a width of ");
        sb.append(i);
        sb.append(" and height of ");
        sb.append(i2);
        sb.append(" in Constraints");
        throw new IllegalArgumentException(sb.toString());
    }

    public static final Void throwInvalidConstraintsSizeException(int i) {
        StringBuilder sb = new StringBuilder("Can't represent a size of ");
        sb.append(i);
        sb.append(" in Constraints");
        throw new IllegalArgumentException(sb.toString());
    }

    public static final long createConstraints(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iBitsNeedForSizeUnchecked = bitsNeedForSizeUnchecked(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iBitsNeedForSizeUnchecked2 = bitsNeedForSizeUnchecked(i6);
        if (iBitsNeedForSizeUnchecked + iBitsNeedForSizeUnchecked2 > 31) {
            throwInvalidConstraintException(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iBitsNeedForSizeUnchecked2 - 13;
        return Constraints.m6876constructorimpl((((long) ((~(i7 >> 31)) & i7)) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << (iBitsNeedForSizeUnchecked2 + 2)) | (((long) ((~(i8 >> 31)) & i8)) << (iBitsNeedForSizeUnchecked2 + 33)));
    }

    private static final int maxAllowedForSize(int i) {
        if (i < MaxNonFocusMask) {
            return MaxAllowedForMaxNonFocusBits;
        }
        if (i < 32767) {
            return MaxAllowedForMinNonFocusBits;
        }
        if (i < 65535) {
            return MaxAllowedForMinFocusBits;
        }
        if (i < MaxFocusMask) {
            return MaxAllowedForMaxFocusBits;
        }
        throwInvalidConstraintsSizeException(i);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m6903constrainN9IONVI(long j, long j2) {
        int iM6890getMinWidthimpl = Constraints.m6890getMinWidthimpl(j);
        int iM6888getMaxWidthimpl = Constraints.m6888getMaxWidthimpl(j);
        int iM6889getMinHeightimpl = Constraints.m6889getMinHeightimpl(j);
        int iM6887getMaxHeightimpl = Constraints.m6887getMaxHeightimpl(j);
        int iM6890getMinWidthimpl2 = Constraints.m6890getMinWidthimpl(j2);
        if (iM6890getMinWidthimpl2 < iM6890getMinWidthimpl) {
            iM6890getMinWidthimpl2 = iM6890getMinWidthimpl;
        }
        if (iM6890getMinWidthimpl2 > iM6888getMaxWidthimpl) {
            iM6890getMinWidthimpl2 = iM6888getMaxWidthimpl;
        }
        int iM6888getMaxWidthimpl2 = Constraints.m6888getMaxWidthimpl(j2);
        if (iM6888getMaxWidthimpl2 >= iM6890getMinWidthimpl) {
            iM6890getMinWidthimpl = iM6888getMaxWidthimpl2;
        }
        if (iM6890getMinWidthimpl <= iM6888getMaxWidthimpl) {
            iM6888getMaxWidthimpl = iM6890getMinWidthimpl;
        }
        int iM6889getMinHeightimpl2 = Constraints.m6889getMinHeightimpl(j2);
        if (iM6889getMinHeightimpl2 < iM6889getMinHeightimpl) {
            iM6889getMinHeightimpl2 = iM6889getMinHeightimpl;
        }
        if (iM6889getMinHeightimpl2 > iM6887getMaxHeightimpl) {
            iM6889getMinHeightimpl2 = iM6887getMaxHeightimpl;
        }
        int iM6887getMaxHeightimpl2 = Constraints.m6887getMaxHeightimpl(j2);
        if (iM6887getMaxHeightimpl2 >= iM6889getMinHeightimpl) {
            iM6889getMinHeightimpl = iM6887getMaxHeightimpl2;
        }
        if (iM6889getMinHeightimpl <= iM6887getMaxHeightimpl) {
            iM6887getMaxHeightimpl = iM6889getMinHeightimpl;
        }
        return Constraints(iM6890getMinWidthimpl2, iM6888getMaxWidthimpl, iM6889getMinHeightimpl2, iM6887getMaxHeightimpl);
    }

    /* JADX INFO: renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m6902constrain4WqzIAM(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iM6890getMinWidthimpl = Constraints.m6890getMinWidthimpl(j);
        int iM6888getMaxWidthimpl = Constraints.m6888getMaxWidthimpl(j);
        if (i < iM6890getMinWidthimpl) {
            i = iM6890getMinWidthimpl;
        }
        if (i <= iM6888getMaxWidthimpl) {
            iM6888getMaxWidthimpl = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iM6889getMinHeightimpl = Constraints.m6889getMinHeightimpl(j);
        int iM6887getMaxHeightimpl = Constraints.m6887getMaxHeightimpl(j);
        if (i2 < iM6889getMinHeightimpl) {
            i2 = iM6889getMinHeightimpl;
        }
        if (i2 <= iM6887getMaxHeightimpl) {
            iM6887getMaxHeightimpl = i2;
        }
        return IntSize.m7101constructorimpl((((long) iM6888getMaxWidthimpl) << 32) | (((long) iM6887getMaxHeightimpl) & 4294967295L));
    }

    /* JADX INFO: renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m6905constrainWidthK40F9xA(long j, int i) {
        int iM6890getMinWidthimpl = Constraints.m6890getMinWidthimpl(j);
        int iM6888getMaxWidthimpl = Constraints.m6888getMaxWidthimpl(j);
        if (i < iM6890getMinWidthimpl) {
            i = iM6890getMinWidthimpl;
        }
        return i > iM6888getMaxWidthimpl ? iM6888getMaxWidthimpl : i;
    }

    /* JADX INFO: renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m6904constrainHeightK40F9xA(long j, int i) {
        int iM6889getMinHeightimpl = Constraints.m6889getMinHeightimpl(j);
        int iM6887getMaxHeightimpl = Constraints.m6887getMaxHeightimpl(j);
        if (i < iM6889getMinHeightimpl) {
            i = iM6889getMinHeightimpl;
        }
        return i > iM6887getMaxHeightimpl ? iM6887getMaxHeightimpl : i;
    }

    /* JADX INFO: renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m6906isSatisfiedBy4WqzIAM(long j, long j2) {
        int iM6890getMinWidthimpl = Constraints.m6890getMinWidthimpl(j);
        int iM6888getMaxWidthimpl = Constraints.m6888getMaxWidthimpl(j);
        int i = (int) (j2 >> 32);
        if (iM6890getMinWidthimpl > i || i > iM6888getMaxWidthimpl) {
            return false;
        }
        int i2 = (int) (j2 & 4294967295L);
        return Constraints.m6889getMinHeightimpl(j) <= i2 && i2 <= Constraints.m6887getMaxHeightimpl(j);
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m6908offsetNN6EwU$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m6907offsetNN6EwU(j, i, i2);
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m6907offsetNN6EwU(long j, int i, int i2) {
        int iM6890getMinWidthimpl = Constraints.m6890getMinWidthimpl(j) + i;
        if (iM6890getMinWidthimpl < 0) {
            iM6890getMinWidthimpl = 0;
        }
        int iM6888getMaxWidthimpl = Constraints.m6888getMaxWidthimpl(j);
        if (iM6888getMaxWidthimpl != Integer.MAX_VALUE && (iM6888getMaxWidthimpl = iM6888getMaxWidthimpl + i) < 0) {
            iM6888getMaxWidthimpl = 0;
        }
        int iM6889getMinHeightimpl = Constraints.m6889getMinHeightimpl(j) + i2;
        if (iM6889getMinHeightimpl < 0) {
            iM6889getMinHeightimpl = 0;
        }
        int iM6887getMaxHeightimpl = Constraints.m6887getMaxHeightimpl(j);
        return Constraints(iM6890getMinWidthimpl, iM6888getMaxWidthimpl, iM6889getMinHeightimpl, (iM6887getMaxHeightimpl == Integer.MAX_VALUE || (iM6887getMaxHeightimpl = iM6887getMaxHeightimpl + i2) >= 0) ? iM6887getMaxHeightimpl : 0);
    }

    public static final long Constraints(int i, int i2, int i3, int i4) {
        boolean z = i2 >= i;
        boolean z2 = i4 >= i3;
        if (!((i3 >= 0) & z & z2 & (i >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return createConstraints(i, i2, i3, i4);
    }
}
