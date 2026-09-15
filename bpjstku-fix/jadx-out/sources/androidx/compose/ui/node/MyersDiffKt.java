package androidx.compose.ui.node;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aO\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aW\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aW\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001a\u001a\u0014\u0010\u001e\u001a\u00020\u0000*\u00020\u0014H\u0082\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a?\u0010 \u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0012H\u0000¢\u0006\u0004\b \u0010!\u001a#\u0010\"\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\"\u0010#"}, d2 = {"", "p0", "p1", "Landroidx/compose/ui/node/DiffCallback;", "p2", "Landroidx/compose/ui/node/IntStack;", "calculateDiff", "(IILandroidx/compose/ui/node/DiffCallback;)Landroidx/compose/ui/node/IntStack;", "", "applyDiff", "(Landroidx/compose/ui/node/IntStack;Landroidx/compose/ui/node/DiffCallback;)V", "executeDiff", "(IILandroidx/compose/ui/node/DiffCallback;)V", "p3", "p4", "Landroidx/compose/ui/node/CenteredArray;", "p5", "p6", "", "p7", "", "midPoint-q5eDKzI", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "midPoint", "p8", "forward-4l5_RBY", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "forward", "backward-4l5_RBY", "backward", "toInt", "(Z)I", "fillSnake", "(IIIIZ[I)V", "swap", "([III)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MyersDiffKt {
    private static final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    private static final IntStack calculateDiff(int i, int i2, DiffCallback diffCallback) {
        int i3 = ((i + i2) + 1) / 2;
        IntStack intStack = new IntStack(i3 * 3);
        IntStack intStack2 = new IntStack(i3 * 4);
        intStack2.pushRange(0, i, 0, i2);
        int i4 = (i3 * 2) + 1;
        int[] iArrM5768constructorimpl = CenteredArray.m5768constructorimpl(new int[i4]);
        int[] iArrM5768constructorimpl2 = CenteredArray.m5768constructorimpl(new int[i4]);
        int[] iArrM5995constructorimpl = Snake.m5995constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int iPop = intStack2.pop();
            int iPop2 = intStack2.pop();
            int iPop3 = intStack2.pop();
            int iPop4 = intStack2.pop();
            int[] iArr = iArrM5995constructorimpl;
            if (m5887midPointq5eDKzI(iPop4, iPop3, iPop2, iPop, diffCallback, iArrM5768constructorimpl, iArrM5768constructorimpl2, iArr)) {
                if (Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]) > 0) {
                    Snake.m5993addDiagonalToStackimpl(iArr, intStack);
                }
                intStack2.pushRange(iPop4, iArr[0], iPop2, iArr[1]);
                intStack2.pushRange(iArr[2], iPop3, iArr[3], iPop);
                iArrM5995constructorimpl = iArr;
            } else {
                iArrM5995constructorimpl = iArr;
            }
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i, i2, 0);
        return intStack;
    }

    private static final void applyDiff(IntStack intStack, DiffCallback diffCallback) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < intStack.getLastIndex()) {
            int i4 = intStack.get(i);
            int i5 = i + 2;
            int i6 = intStack.get(i5);
            int i7 = intStack.get(i + 1);
            int i8 = intStack.get(i5);
            i += 3;
            while (i3 < i4 - i6) {
                diffCallback.remove(i2, i3);
                i3++;
            }
            while (i2 < i7 - i8) {
                diffCallback.insert(i2);
                i2++;
            }
            for (int i9 = intStack.get(i5); i9 > 0; i9--) {
                diffCallback.same(i3, i2);
                i3++;
                i2++;
            }
        }
    }

    public static final void executeDiff(int i, int i2, DiffCallback diffCallback) {
        applyDiff(calculateDiff(i, i2, diffCallback), diffCallback);
    }

    /* JADX INFO: renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m5887midPointq5eDKzI(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i2 - i;
        int i6 = i4 - i3;
        if (i5 > 0 && i6 > 0) {
            int i7 = ((i5 + i6) + 1) / 2;
            CenteredArray.m5774setimpl(iArr, 1, i);
            CenteredArray.m5774setimpl(iArr2, 1, i2);
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i8;
                if (m5886forward4l5_RBY(i, i2, i3, i4, diffCallback, iArr, iArr2, i8, iArr3) || m5885backward4l5_RBY(i, i2, i3, i4, diffCallback, iArr, iArr2, i9, iArr3)) {
                    return true;
                }
                i8 = i9 + 1;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m5886forward4l5_RBY(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int iM5771getimpl;
        int i6;
        int i7 = i2;
        int i8 = (i7 - i) - (i4 - i3);
        int i9 = 1;
        boolean z = (Math.abs(i8) & 1) == 1;
        int i10 = -i5;
        int i11 = i10;
        while (i11 <= i5) {
            if (i11 == i10 || (i11 != i5 && CenteredArray.m5771getimpl(iArr, i11 + 1) > CenteredArray.m5771getimpl(iArr, i11 - 1))) {
                iM5771getimpl = CenteredArray.m5771getimpl(iArr, i11 + 1);
                i6 = iM5771getimpl;
            } else {
                iM5771getimpl = CenteredArray.m5771getimpl(iArr, i11 - 1);
                i6 = iM5771getimpl + 1;
            }
            int i12 = (i3 + (i6 - i)) - i11;
            int i13 = i5 != 0 ? i9 : 0;
            int i14 = i6 == iM5771getimpl ? i9 : 0;
            int i15 = i12;
            while (true) {
                if (i6 < i7 && i15 < i4) {
                    if (!diffCallback.areItemsTheSame(i6, i15)) {
                        break;
                    }
                    i6++;
                    i15++;
                } else {
                    break;
                }
            }
            CenteredArray.m5774setimpl(iArr, i11, i6);
            if (z) {
                int i16 = i8 - i11;
                if (i16 >= i10 + 1 && i16 <= i5 - 1) {
                    if (CenteredArray.m5771getimpl(iArr2, i16) <= i6) {
                        fillSnake(iM5771getimpl, i12 - (i13 & i14), i6, i15, false, iArr3);
                        return true;
                    }
                }
                i9 = 1;
            }
            i11 += 2;
            i7 = i2;
        }
        return false;
    }

    /* JADX INFO: renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m5885backward4l5_RBY(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int iM5771getimpl;
        int i6;
        int i7;
        int i8 = i;
        int i9 = (i2 - i8) - (i4 - i3);
        boolean z = (i9 & 1) == 0;
        int i10 = -i5;
        int i11 = i10;
        while (i11 <= i5) {
            if (i11 == i10 || (i11 != i5 && CenteredArray.m5771getimpl(iArr2, i11 + 1) < CenteredArray.m5771getimpl(iArr2, i11 - 1))) {
                iM5771getimpl = CenteredArray.m5771getimpl(iArr2, i11 + 1);
                i6 = iM5771getimpl;
            } else {
                iM5771getimpl = CenteredArray.m5771getimpl(iArr2, i11 - 1);
                i6 = iM5771getimpl - 1;
            }
            int i12 = i4 - ((i2 - i6) - i11);
            int i13 = i5 != 0 ? 1 : 0;
            int i14 = i6 == iM5771getimpl ? 1 : 0;
            int i15 = i12;
            while (true) {
                if (i6 > i8 && i15 > i3) {
                    if (!diffCallback.areItemsTheSame(i6 - 1, i15 - 1)) {
                        break;
                    }
                    i6--;
                    i15--;
                    i8 = i;
                } else {
                    break;
                }
            }
            CenteredArray.m5774setimpl(iArr2, i11, i6);
            if (z && (i7 = i9 - i11) >= i10 && i7 <= i5) {
                if (CenteredArray.m5771getimpl(iArr, i7) >= i6) {
                    fillSnake(i6, i15, iM5771getimpl, (i13 & i14) + i12, true, iArr3);
                    return true;
                }
            }
            i11 += 2;
            i8 = i;
        }
        return false;
    }

    public static final void fillSnake(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
