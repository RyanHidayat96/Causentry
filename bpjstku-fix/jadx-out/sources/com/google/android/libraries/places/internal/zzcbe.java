package com.google.android.libraries.places.internal;

import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbe {
    private static final byte[] zza = zzcbm.zza("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").zza();

    static {
        zzcbm.zza("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }

    public static /* synthetic */ String zza(byte[] bArr, byte[] bArr2, int i, Object obj) {
        byte[] bArr3 = zza;
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        int length = bArr.length;
        int i2 = length - (length % 3);
        byte[] bArr4 = new byte[((length + 2) / 3) * 4];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            byte b = bArr[i3];
            byte b2 = bArr[i3 + 1];
            int i5 = i3 + 3;
            byte b3 = bArr[i3 + 2];
            bArr4[i4] = bArr3[(b & UByte.MAX_VALUE) >> 2];
            bArr4[i4 + 1] = bArr3[((b & 3) << 4) | ((b2 & UByte.MAX_VALUE) >> 4)];
            bArr4[i4 + 2] = bArr3[((b2 & 15) << 2) | ((b3 & UByte.MAX_VALUE) >> 6)];
            bArr4[i4 + 3] = bArr3[b3 & 63];
            i4 += 4;
            i3 = i5;
        }
        int length2 = bArr.length - i2;
        if (length2 == 1) {
            byte b4 = bArr[i3];
            bArr4[i4] = bArr3[(b4 & UByte.MAX_VALUE) >> 2];
            bArr4[i4 + 1] = bArr3[(b4 & 3) << 4];
            bArr4[i4 + 2] = Base64.padSymbol;
            bArr4[i4 + 3] = Base64.padSymbol;
        } else if (length2 == 2) {
            byte b5 = bArr[i3];
            byte b6 = bArr[i3 + 1];
            bArr4[i4] = bArr3[(b5 & UByte.MAX_VALUE) >> 2];
            bArr4[i4 + 1] = bArr3[((b5 & 3) << 4) | ((b6 & UByte.MAX_VALUE) >> 4)];
            bArr4[i4 + 2] = bArr3[(b6 & 15) << 2];
            bArr4[i4 + 3] = Base64.padSymbol;
        }
        return zzccc.zza(bArr4);
    }
}
