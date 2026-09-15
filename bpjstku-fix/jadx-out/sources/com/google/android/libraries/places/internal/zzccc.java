package com.google.android.libraries.places.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccc {
    public static final String zza(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new String(bArr, Charsets.UTF_8);
    }

    public static final byte[] zzb(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes;
    }
}
