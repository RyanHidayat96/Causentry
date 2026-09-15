package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzbvv extends zzbvt {
    @Override // com.google.android.libraries.places.internal.zzbvt
    public final boolean zza(zzbvw zzbvwVar, int i, int i2) {
        synchronized (zzbvwVar) {
            if (zzbvwVar.zza() != 0) {
                return false;
            }
            zzbvwVar.zzb(-1);
            return true;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public final void zzb(zzbvw zzbvwVar, int i) {
        synchronized (zzbvwVar) {
            zzbvwVar.zzb(0);
        }
    }

    private zzbvv() {
        throw null;
    }

    /* synthetic */ zzbvv(byte[] bArr) {
        super(null);
    }
}
