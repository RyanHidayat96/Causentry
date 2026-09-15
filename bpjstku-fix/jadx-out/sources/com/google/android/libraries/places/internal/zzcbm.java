package com.google.android.libraries.places.internal;

import java.util.Arrays;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbm {
    @JvmStatic
    public static final zzcbn zza(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        zzcbn zzcbnVar = new zzcbn(zzccc.zzb(str));
        zzcbnVar.zzd(str);
        return zzcbnVar;
    }

    @JvmStatic
    public static final zzcbn zzb(byte... bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        return new zzcbn(bArrCopyOf);
    }
}
