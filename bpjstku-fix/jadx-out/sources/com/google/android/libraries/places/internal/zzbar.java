package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzbar extends IOException {
    private boolean zza;

    public zzbar(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public zzbar(String str) {
        super(str);
    }

    final void zza() {
        this.zza = true;
    }

    final boolean zzb() {
        return this.zza;
    }
}
