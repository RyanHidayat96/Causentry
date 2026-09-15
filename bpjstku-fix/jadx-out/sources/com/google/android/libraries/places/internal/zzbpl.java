package com.google.android.libraries.places.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbpl {
    private final ArrayList zza = new ArrayList();

    public final String toString() {
        return this.zza.toString();
    }

    public final zzbpl zza(Object obj) {
        this.zza.add(String.valueOf(obj));
        return this;
    }

    public final zzbpl zzb(String str, Object obj) {
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(strValueOf).length());
        sb.append(str);
        sb.append("=");
        sb.append(strValueOf);
        this.zza.add(sb.toString());
        return this;
    }
}
