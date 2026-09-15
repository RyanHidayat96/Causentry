package com.google.android.gms.internal.maps;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes6.dex */
final class zzbp extends zzbz {
    private final Object zza;
    private boolean zzb;

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zzb) {
            throw new NoSuchElementException();
        }
        this.zzb = true;
        return this.zza;
    }

    zzbp(Object obj) {
        this.zza = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzb;
    }
}
