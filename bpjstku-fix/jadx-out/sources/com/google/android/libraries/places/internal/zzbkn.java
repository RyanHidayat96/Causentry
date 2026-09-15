package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbkn implements zzbtu {
    @Override // com.google.android.libraries.places.internal.zzbtu, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public boolean zza() {
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public void zzb() {
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public void zzc() {
        throw new UnsupportedOperationException();
    }

    protected final void zzd(int i) {
        if (zzf() < i) {
            throw new IndexOutOfBoundsException();
        }
    }
}
