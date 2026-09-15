package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
final class zztq implements Iterator {
    final /* synthetic */ zztr zza;
    private int zzb;

    zztq(zztr zztrVar) {
        Objects.requireNonNull(zztrVar);
        this.zza = zztrVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb;
        zztr zztrVar = this.zza;
        return i < zztrVar.zzb() - zztrVar.zza();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.zzb;
        zztr zztrVar = this.zza;
        if (i >= zztrVar.zzb() - zztrVar.zza()) {
            throw new NoSuchElementException();
        }
        Object obj = zztrVar.zzb.zzb()[zztrVar.zza() + i];
        this.zzb = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
