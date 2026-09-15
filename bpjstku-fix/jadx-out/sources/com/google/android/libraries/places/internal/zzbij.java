package com.google.android.libraries.places.internal;

import defpackage.CameraStateRegistryCameraRegistration;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
final class zzbij extends zzbil {
    private final zzbik zzb;

    /* synthetic */ zzbij(String str, boolean z, zzbik zzbikVar, byte[] bArr) {
        super(str, false, zzbikVar, null);
        if (!(!str.endsWith("-bin"))) {
            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        if (zzbikVar == null) {
            throw new NullPointerException("marshaller");
        }
        this.zzb = zzbikVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbil
    final byte[] zza(Object obj) {
        String strZzb = this.zzb.zzb(obj);
        if (strZzb != null) {
            return strZzb.getBytes(StandardCharsets.US_ASCII);
        }
        throw new NullPointerException("null marshaller.toAsciiString()");
    }

    @Override // com.google.android.libraries.places.internal.zzbil
    final Object zzb(byte[] bArr) {
        return this.zzb.zza(new String(bArr, StandardCharsets.US_ASCII));
    }
}
