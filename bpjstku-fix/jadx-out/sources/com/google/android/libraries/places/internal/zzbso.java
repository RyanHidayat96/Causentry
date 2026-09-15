package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbso extends OutputStream {
    final /* synthetic */ zzbsr zza;
    private final List zzb;
    private zzbwq zzc;

    /* synthetic */ zzbso(zzbsr zzbsrVar, byte[] bArr) {
        Objects.requireNonNull(zzbsrVar);
        this.zza = zzbsrVar;
        this.zzb = new ArrayList();
    }

    final /* synthetic */ int zza() {
        Iterator it = this.zzb.iterator();
        int iZzd = 0;
        while (it.hasNext()) {
            iZzd += ((zzbwq) it.next()).zzd();
        }
        return iZzd;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        zzbwq zzbwqVar = this.zzc;
        byte b = (byte) i;
        if (zzbwqVar == null || zzbwqVar.zzc() <= 0) {
            write(new byte[]{b}, 0, 1);
        } else {
            zzbwqVar.zzb(b);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.zzc == null) {
            zzbsr zzbsrVar = this.zza;
            zzbwq zzbwqVarZza = zzbsrVar.zzh().zza(Math.max(4096, i2));
            this.zzc = zzbwqVarZza;
            this.zzb.add(zzbwqVarZza);
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, this.zzc.zzc());
            if (iMin == 0) {
                int iZzd = this.zzc.zzd();
                zzbwq zzbwqVarZza2 = this.zza.zzh().zza(Math.max(i2, iZzd + iZzd));
                this.zzc = zzbwqVarZza2;
                this.zzb.add(zzbwqVarZza2);
            } else {
                this.zzc.zza(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
        }
    }

    final /* synthetic */ List zzb() {
        return this.zzb;
    }
}
