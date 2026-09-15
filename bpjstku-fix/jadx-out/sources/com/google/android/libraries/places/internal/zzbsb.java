package com.google.android.libraries.places.internal;

import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
final class zzbsb {
    public final URI zza;
    public final zzbjg zzb;

    public zzbsb(URI uri, zzbjg zzbjgVar) {
        if (uri == null) {
            throw new NullPointerException("targetUri");
        }
        this.zza = uri;
        if (zzbjgVar == null) {
            throw new NullPointerException("provider");
        }
        this.zzb = zzbjgVar;
    }
}
