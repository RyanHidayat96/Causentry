package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzdh implements Serializable {
    zzdh() {
    }

    public abstract Object zza();

    public abstract boolean zzb();

    public static zzdh zzc() {
        return zzdf.zza;
    }

    public static zzdh zzd(Object obj) {
        return new zzdi(obj);
    }
}
