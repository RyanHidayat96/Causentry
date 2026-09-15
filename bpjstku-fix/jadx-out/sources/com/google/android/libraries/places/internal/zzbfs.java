package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfs implements zzbft {
    public static final zzbft zza = new zzbfs();

    @Override // com.google.android.libraries.places.internal.zzbfu
    public final OutputStream zzb(OutputStream outputStream) {
        return outputStream;
    }

    @Override // com.google.android.libraries.places.internal.zzbgh
    public final InputStream zzc(InputStream inputStream) {
        return inputStream;
    }

    private zzbfs() {
    }

    @Override // com.google.android.libraries.places.internal.zzbfu, com.google.android.libraries.places.internal.zzbgh
    public final String zza() {
        return "identity";
    }
}
