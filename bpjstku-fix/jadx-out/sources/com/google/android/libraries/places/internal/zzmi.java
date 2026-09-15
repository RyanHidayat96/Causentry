package com.google.android.libraries.places.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmi implements zzbep {
    private final zzbes zza;

    public static Context zzd(Context context) {
        Context applicationContext = context.getApplicationContext();
        zzber.zza(applicationContext);
        return applicationContext;
    }

    @Override // com.google.android.libraries.places.internal.zzcbd
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Context zzb() {
        return zzd((Context) this.zza.zzb());
    }

    private zzmi(zzbes zzbesVar) {
        this.zza = zzbesVar;
    }

    public static zzmi zzc(zzbes zzbesVar) {
        return new zzmi(zzbesVar);
    }
}
