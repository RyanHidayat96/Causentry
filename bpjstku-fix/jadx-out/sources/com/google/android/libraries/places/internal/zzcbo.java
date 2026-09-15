package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class zzcbo implements zzcbz {
    private final InputStream zza;
    private final zzccb zzb;

    @Override // com.google.android.libraries.places.internal.zzcbz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
    }

    public final String toString() {
        InputStream inputStream = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(inputStream).length() + 8);
        sb.append("source(");
        sb.append(inputStream);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcbz
    public final long zza(zzcbj zzcbjVar, long j) throws IOException {
        Intrinsics.checkNotNullParameter(zzcbjVar, "");
        try {
            this.zzb.zzb();
            zzcbu zzcbuVarZzE = zzcbjVar.zzE(1);
            int i = this.zza.read(zzcbuVarZzE.zza, zzcbuVarZzE.zzc, (int) Math.min(j, 8192 - zzcbuVarZzE.zzc));
            if (i != -1) {
                zzcbuVarZzE.zzc += i;
                long j2 = i;
                zzcbjVar.zzd(zzcbjVar.zzb() + j2);
                return j2;
            }
            if (zzcbuVarZzE.zzb != zzcbuVarZzE.zzc) {
                return -1L;
            }
            zzcbjVar.zza = zzcbuVarZzE.zzb();
            zzcbv.zzb(zzcbuVarZzE);
            return -1L;
        } catch (AssertionError e2) {
            if (zzcbq.zza(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    public zzcbo(InputStream inputStream, zzccb zzccbVar) {
        Intrinsics.checkNotNullParameter(inputStream, "");
        Intrinsics.checkNotNullParameter(zzccbVar, "");
        this.zza = inputStream;
        this.zzb = zzccbVar;
    }
}
