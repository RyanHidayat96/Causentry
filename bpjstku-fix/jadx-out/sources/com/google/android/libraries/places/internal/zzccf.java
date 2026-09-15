package com.google.android.libraries.places.internal;

import defpackage.ChainingListenableFuture;
import defpackage.FutureCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccf {
    /* JADX WARN: Code duplicated, block: B:11:0x002f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    public static final int zza(zzcbw zzcbwVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(zzcbwVar, "");
        int[] iArrZzr = zzcbwVar.zzr();
        int length = zzcbwVar.zzq().length;
        Intrinsics.checkNotNullParameter(iArrZzr, "");
        int i3 = length - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = i + 1;
            i2 = (i4 + i3) >>> 1;
            int i6 = iArrZzr[i2];
            if (i6 < i5) {
                i4 = i2 + 1;
            } else {
                if (i6 <= i5) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                i3 = i2 - 1;
            }
        }
        i2 = (-i4) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FutureCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] = ChainingListenableFuture.TuitionPaymentFragmentbindingInflater1[0];
    }
}
