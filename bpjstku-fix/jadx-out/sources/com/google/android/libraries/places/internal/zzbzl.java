package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbzl implements zzbzp {
    private static final Logger zza = Logger.getLogger(zzbzi.class.getName());
    private static final zzcbn zzb = zzcbm.zza("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    static /* synthetic */ IllegalArgumentException zzc(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    static /* synthetic */ int zze(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return i - s;
        }
        throw zzi("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    static /* synthetic */ int zzf(zzcbl zzcblVar) throws IOException {
        return (zzcblVar.zzj() & UByte.MAX_VALUE) | ((zzcblVar.zzj() & UByte.MAX_VALUE) << 16) | ((zzcblVar.zzj() & UByte.MAX_VALUE) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException zzi(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    @Override // com.google.android.libraries.places.internal.zzbzp
    public final zzbzb zza(zzcbl zzcblVar, boolean z) {
        return new zzbzj(zzcblVar, 4096, true);
    }

    @Override // com.google.android.libraries.places.internal.zzbzp
    public final zzbzc zzb(zzcbk zzcbkVar, boolean z) {
        return new zzbzk(zzcbkVar, true);
    }
}
