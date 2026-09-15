package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Process;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbr {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static int b;

    static void zza(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = b;
        int i2 = i % 5072107;
        b = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        int iMyTid = Process.myTid();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iMyTid;
        return iMyTid;
    }
}
