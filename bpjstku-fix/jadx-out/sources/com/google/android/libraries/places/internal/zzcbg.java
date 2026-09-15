package com.google.android.libraries.places.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbg implements zzcbx {
    final /* synthetic */ zzcbx zza;

    @Override // com.google.android.libraries.places.internal.zzcbx, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // com.google.android.libraries.places.internal.zzcbx, java.io.Flushable
    public final void flush() {
        try {
            try {
                this.zza.flush();
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
        zzcbx zzcbxVar = this.zza;
        StringBuilder sb = new StringBuilder(zzcbxVar.toString().length() + 19);
        sb.append("AsyncTimeout.sink(");
        sb.append(zzcbxVar);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcbx
    public final void zzc(zzcbj zzcbjVar, long j) {
        Intrinsics.checkNotNullParameter(zzcbjVar, "");
        zzcbf.zza(zzcbjVar.zzb(), 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            zzcbu zzcbuVar = zzcbjVar.zza;
            Intrinsics.checkNotNull(zzcbuVar);
            while (j2 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                j2 += (long) (zzcbuVar.zzc - zzcbuVar.zzb);
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    zzcbuVar = zzcbuVar.zzf;
                    Intrinsics.checkNotNull(zzcbuVar);
                }
            }
            try {
                this.zza.zzc(zzcbjVar, j2);
                Unit unit = Unit.INSTANCE;
                zzcbi.zza();
                j -= j2;
            } catch (IOException e2) {
                throw e2;
            } finally {
                zzcbi.zza();
            }
        }
    }

    zzcbg(zzcbi zzcbiVar, zzcbx zzcbxVar) {
        this.zza = zzcbxVar;
    }
}
