package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbce implements Iterator {
    final /* synthetic */ zzbcg zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzbce(zzbcg zzbcgVar, byte[] bArr) {
        Objects.requireNonNull(zzbcgVar);
        this.zza = zzbcgVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb;
        zzbcg zzbcgVar = this.zza;
        if (i + 1 >= zzbcgVar.zzj()) {
            return !zzbcgVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzbcg zzbcgVar = this.zza;
        return i < zzbcgVar.zzj() ? (zzbcd) zzbcgVar.zzi()[i] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzbcg zzbcgVar = this.zza;
        zzbcgVar.zzh();
        int i = this.zzb;
        if (i >= zzbcgVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzbcgVar.zzg(i);
        }
    }
}
