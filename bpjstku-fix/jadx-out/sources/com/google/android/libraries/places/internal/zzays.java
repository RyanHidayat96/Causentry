package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzays {
    static /* synthetic */ String zzb(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public abstract void zza(byte[] bArr, int i, int i2) throws IOException;
}
