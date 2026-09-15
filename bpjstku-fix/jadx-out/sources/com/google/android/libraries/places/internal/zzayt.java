package com.google.android.libraries.places.internal;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzayt extends zzayu {
    final /* synthetic */ zzayz zza;
    private int zzb;
    private final int zzc;

    zzayt(zzayz zzayzVar) {
        Objects.requireNonNull(zzayzVar);
        this.zza = zzayzVar;
        this.zzb = 0;
        this.zzc = zzayzVar.zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzayw
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }
}
