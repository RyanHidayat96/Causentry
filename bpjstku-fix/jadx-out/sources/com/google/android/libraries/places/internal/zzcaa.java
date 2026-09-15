package com.google.android.libraries.places.internal;

import com.appsflyer.AppsFlyerProperties;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcaa {
    private final zzbfe zza;
    private final zzbfd zzb;

    protected zzcaa(zzbfe zzbfeVar, zzbfd zzbfdVar) {
        if (zzbfeVar == null) {
            throw new NullPointerException(AppsFlyerProperties.CHANNEL);
        }
        this.zza = zzbfeVar;
        if (zzbfdVar == null) {
            throw new NullPointerException("callOptions");
        }
        this.zzb = zzbfdVar;
    }

    protected abstract zzcaa zza(zzbfe zzbfeVar, zzbfd zzbfdVar);

    public final zzcaa zze(zzbfj... zzbfjVarArr) {
        return zza(zzbfl.zza(this.zza, Arrays.asList(zzbfjVarArr)), this.zzb);
    }

    public final zzbfe zzc() {
        return this.zza;
    }

    public final zzbfd zzd() {
        return this.zzb;
    }
}
