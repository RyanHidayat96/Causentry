package com.google.android.libraries.places.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbf {
    public static final void zza(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 13 + String.valueOf(j2).length() + 11 + String.valueOf(j3).length());
            sb.append("size=");
            sb.append(j);
            sb.append(" offset=");
            sb.append(j2);
            sb.append(" byteCount=");
            sb.append(j3);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    public static final boolean zzb(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final String zzc(int i) {
        int i2 = 0;
        char[] cArr = {zzcce.zza()[i >> 28], zzcce.zza()[(i >> 24) & 15], zzcce.zza()[(i >> 20) & 15], zzcce.zza()[(i >> 16) & 15], zzcce.zza()[(i >> 12) & 15], zzcce.zza()[(i >> 8) & 15], zzcce.zza()[(i >> 4) & 15], zzcce.zza()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return StringsKt.concatToString(cArr, i2, 8);
    }
}
