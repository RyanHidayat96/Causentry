package com.google.android.libraries.places.internal;

import defpackage.CameraStateRegistryCameraRegistration;

/* JADX INFO: loaded from: classes3.dex */
final class zzbin extends zzbil {
    private final zzbio zzb;

    /* synthetic */ zzbin(String str, boolean z, zzbio zzbioVar, byte[] bArr) {
        super(str, z, zzbioVar, null);
        if (!(!str.endsWith("-bin"))) {
            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        if (zzbioVar == null) {
            throw new NullPointerException("marshaller");
        }
        this.zzb = zzbioVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbil
    final byte[] zza(Object obj) {
        byte[] bArrZza = this.zzb.zza(obj);
        if (bArrZza != null) {
            return bArrZza;
        }
        throw new NullPointerException("null marshaller.toAsciiString()");
    }

    @Override // com.google.android.libraries.places.internal.zzbil
    final Object zzb(byte[] bArr) {
        return this.zzb.zzb(bArr);
    }
}
