package com.google.android.gms.internal.fido;

import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: classes6.dex */
final class zzbd extends zzbe {
    zzbd(String str, String str2, Character ch) {
        zzbb zzbbVar = new zzbb(str, str2.toCharArray());
        super(zzbbVar, ch);
        zzam.zzc(zzbb.zzc(zzbbVar).length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzbe, com.google.android.gms.internal.fido.zzbf
    final void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzam.zze(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            byte b = bArr[i3];
            byte b2 = bArr[i3 + 1];
            byte b3 = bArr[i3 + 2];
            zzbb zzbbVar = this.zzb;
            int i5 = ((b & UByte.MAX_VALUE) << 16) | ((b2 & UByte.MAX_VALUE) << 8) | (b3 & UByte.MAX_VALUE);
            appendable.append(zzbbVar.zza(i5 >>> 18));
            appendable.append(this.zzb.zza((i5 >>> 12) & 63));
            appendable.append(this.zzb.zza((i5 >>> 6) & 63));
            appendable.append(this.zzb.zza(i5 & 63));
            i3 += 3;
        }
        if (i3 < i2) {
            zzc(appendable, bArr, i3, i2 - i3);
        }
    }
}
