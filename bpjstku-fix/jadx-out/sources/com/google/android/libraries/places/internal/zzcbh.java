package com.google.android.libraries.places.internal;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbh implements zzcbz {
    final /* synthetic */ zzcbz zza;

    @Override // com.google.android.libraries.places.internal.zzcbz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            try {
                this.zza.close();
                Unit unit = Unit.INSTANCE;
                zzcbi.zza();
            } catch (IOException e2) {
                zzcbi.zza();
                throw e2;
            }
        } catch (Throwable th) {
            zzcbi.zza();
            throw th;
        }
    }

    public final String toString() {
        zzcbz zzcbzVar = this.zza;
        StringBuilder sb = new StringBuilder(zzcbzVar.toString().length() + 21);
        sb.append("AsyncTimeout.source(");
        sb.append(zzcbzVar);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcbz
    public final long zza(zzcbj zzcbjVar, long j) {
        Intrinsics.checkNotNullParameter(zzcbjVar, "");
        try {
            try {
                long jZza = this.zza.zza(zzcbjVar, j);
                zzcbi.zza();
                return jZza;
            } catch (IOException e2) {
                zzcbi.zza();
                throw e2;
            }
        } catch (Throwable th) {
            zzcbi.zza();
            throw th;
        }
    }

    zzcbh(zzcbi zzcbiVar, zzcbz zzcbzVar) {
        this.zza = zzcbzVar;
    }
}
