package com.google.android.libraries.places.internal;

import android.content.Context;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbpk {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Set zza = Collections.newSetFromMap(new IdentityHashMap());

    public final void zza(Object obj, boolean z) {
        Set set = this.zza;
        int size = set.size();
        if (z) {
            set.add(obj);
            if (size == 0) {
                zzd();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            zze();
        }
    }

    public final boolean zzb() {
        return !this.zza.isEmpty();
    }

    public final boolean zzc(Object... objArr) {
        for (int i = 0; i < 2; i++) {
            if (this.zza.contains(objArr[i])) {
                return true;
            }
        }
        return false;
    }

    protected abstract void zzd();

    protected abstract void zze();

    public static int b() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 7077065;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        return i3;
    }
}
