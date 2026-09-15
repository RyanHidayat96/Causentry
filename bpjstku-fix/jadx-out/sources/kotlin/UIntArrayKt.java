package kotlin;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\n\u001a\u00020\u00052\n\u0010\u0001\u001a\u00020\u0005\"\u00020\u0003H\u0087\b¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "p0", "Lkotlin/Function1;", "Lkotlin/UInt;", "p1", "Lkotlin/UIntArray;", "UIntArray", "(ILkotlin/jvm/functions/Function1;)[I", "uintArrayOf--ajY-9A", "([I)[I", "uintArrayOf"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UIntArrayKt {
    private static final int[] UIntArray(int i, Function1<? super Integer, UInt> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = function1.invoke(Integer.valueOf(i2)).getData();
        }
        return UIntArray.m8179constructorimpl(iArr);
    }

    /* JADX INFO: renamed from: uintArrayOf--ajY-9A, reason: not valid java name */
    private static final int[] m8195uintArrayOfajY9A(int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return iArr;
    }
}
