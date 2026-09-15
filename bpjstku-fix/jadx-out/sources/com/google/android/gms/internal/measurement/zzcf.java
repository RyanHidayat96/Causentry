package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.updateAndVerifyState;

/* JADX INFO: loaded from: classes5.dex */
public final class zzcf {
    private static final ThreadLocal zza = new zzce();

    public static SharedPreferences zza(Context context, String str, int i, zzca zzcaVar) {
        zzbv.zza();
        zzcd zzcdVar = str.equals("") ? new zzcd() : null;
        if (zzcdVar != null) {
            return zzcdVar;
        }
        ThreadLocal threadLocal = zza;
        updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault1(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(false);
        try {
            return context.getSharedPreferences(str, 0);
        } finally {
            zza.set(true);
        }
    }
}
