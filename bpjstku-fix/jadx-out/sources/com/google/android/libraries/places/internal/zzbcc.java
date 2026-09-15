package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbcc extends zzbcg {
    zzbcc() {
        super(null);
    }

    @Override // com.google.android.libraries.places.internal.zzbcg
    public final void zza() {
        if (!zzb()) {
            for (int i = 0; i < zzc(); i++) {
                ((zzazt) ((zzbcd) zzd(i)).zza()).zzd();
            }
            Iterator it = zze().iterator();
            while (it.hasNext()) {
                ((zzazt) ((Map.Entry) it.next()).getKey()).zzd();
            }
        }
        super.zza();
    }
}
