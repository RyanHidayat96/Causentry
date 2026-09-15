package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
final class zzbzv implements zzbit {
    private static final ThreadLocal zza = new ThreadLocal();
    private final zzbbt zzb;
    private final zzbbl zzc;

    zzbzv(zzbbl zzbblVar, int i) {
        if (zzbblVar == null) {
            throw new NullPointerException("defaultInstance cannot be null");
        }
        this.zzc = zzbblVar;
        this.zzb = zzbblVar.zzbf();
    }

    @Override // com.google.android.libraries.places.internal.zzbir
    public final /* synthetic */ InputStream zza(Object obj) {
        return new zzbzu((zzbbl) obj, this.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzbir
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        byte[] bArr;
        zzazc zzazcVarZzG;
        if (inputStream instanceof zzbzu) {
            zzbzu zzbzuVar = (zzbzu) inputStream;
            if (zzbzuVar.zzc() == this.zzb) {
                try {
                    return zzbzuVar.zzb();
                } catch (IllegalStateException unused) {
                }
            }
        }
        if (inputStream instanceof zzbhl) {
            try {
                int iAvailable = inputStream.available();
                if (iAvailable <= 0 || iAvailable > 4194304) {
                    if (iAvailable == 0) {
                        return this.zzc;
                    }
                    zzazcVarZzG = null;
                } else {
                    ThreadLocal threadLocal = zza;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i = iAvailable;
                    while (i > 0) {
                        int i2 = inputStream.read(bArr, iAvailable - i, i);
                        if (i2 == -1) {
                            break;
                        }
                        i -= i2;
                    }
                    if (i != 0) {
                        int i3 = iAvailable - i;
                        StringBuilder sb = new StringBuilder(String.valueOf(iAvailable).length() + 21 + String.valueOf(i3).length());
                        sb.append("size inaccurate: ");
                        sb.append(iAvailable);
                        sb.append(" != ");
                        sb.append(i3);
                        throw new RuntimeException(sb.toString());
                    }
                    zzazcVarZzG = zzazc.zzG(bArr, 0, iAvailable);
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            zzazcVarZzG = null;
        }
        if (zzazcVarZzG == null) {
            zzazcVarZzG = zzazc.zzF(inputStream, 4096);
        }
        zzazcVarZzG.zzL(Integer.MAX_VALUE);
        try {
            zzbbl zzbblVar = (zzbbl) this.zzb.zza(zzazcVarZzG, zzbzw.zza);
            try {
                zzazcVarZzG.zzb(0);
                return zzbblVar;
            } catch (zzbar e3) {
                throw e3;
            }
        } catch (zzbar e4) {
            throw new zzbjy(zzbjv.zzh.zze("Invalid protobuf byte sequence").zzd(e4), null);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbit
    public final Class zzc() {
        return this.zzc.getClass();
    }
}
