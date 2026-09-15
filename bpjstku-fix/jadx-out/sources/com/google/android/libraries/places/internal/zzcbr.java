package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class zzcbr implements zzcbx {
    private final OutputStream zza;
    private final zzccb zzb;

    @Override // com.google.android.libraries.places.internal.zzcbx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
    }

    @Override // com.google.android.libraries.places.internal.zzcbx, java.io.Flushable
    public final void flush() throws IOException {
        this.zza.flush();
    }

    public final String toString() {
        OutputStream outputStream = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(outputStream).length() + 6);
        sb.append("sink(");
        sb.append(outputStream);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcbx
    public final void zzc(zzcbj zzcbjVar, long j) throws IOException {
        Intrinsics.checkNotNullParameter(zzcbjVar, "");
        zzcbf.zza(zzcbjVar.zzb(), 0L, j);
        while (j > 0) {
            this.zzb.zzb();
            zzcbu zzcbuVar = zzcbjVar.zza;
            Intrinsics.checkNotNull(zzcbuVar);
            int iMin = (int) Math.min(j, zzcbuVar.zzc - zzcbuVar.zzb);
            this.zza.write(zzcbuVar.zza, zzcbuVar.zzb, iMin);
            zzcbuVar.zzb += iMin;
            long j2 = iMin;
            zzcbjVar.zzd(zzcbjVar.zzb() - j2);
            j -= j2;
            if (zzcbuVar.zzb == zzcbuVar.zzc) {
                zzcbjVar.zza = zzcbuVar.zzb();
                zzcbv.zzb(zzcbuVar);
            }
        }
    }

    public zzcbr(OutputStream outputStream, zzccb zzccbVar) {
        Intrinsics.checkNotNullParameter(outputStream, "");
        Intrinsics.checkNotNullParameter(zzccbVar, "");
        this.zza = outputStream;
        this.zzb = zzccbVar;
    }
}
