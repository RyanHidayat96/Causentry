package com.google.android.libraries.places.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbrw {
    final Object zza;
    Collection zzb;
    zzbjv zzc;
    final /* synthetic */ zzbrx zzd;

    /* synthetic */ zzbrw(zzbrx zzbrxVar, byte[] bArr) {
        Objects.requireNonNull(zzbrxVar);
        this.zzd = zzbrxVar;
        this.zza = new Object();
        this.zzb = new HashSet();
    }

    final void zza(zzbjv zzbjvVar) {
        synchronized (this.zza) {
            if (this.zzc != null) {
                return;
            }
            this.zzc = zzbjvVar;
            boolean zIsEmpty = this.zzb.isEmpty();
            if (zIsEmpty) {
                this.zzd.zzK().zzd(zzbjvVar);
            }
        }
    }
}
