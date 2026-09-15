package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzbph implements zzbhg {
    @Override // com.google.android.libraries.places.internal.zzbio
    public final /* synthetic */ byte[] zza(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.libraries.places.internal.zzbio
    public final /* synthetic */ Object zzb(byte[] bArr) {
        if (bArr.length >= 3) {
            return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
        }
        throw new NumberFormatException("Malformed status code ".concat(new String(bArr, zzbhh.zza)));
    }

    zzbph() {
    }
}
