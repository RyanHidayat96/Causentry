package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzayv extends zzayy {
    private final int zzc;

    zzayv(byte[] bArr, int i, int i2) {
        super(bArr);
        zzj(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.libraries.places.internal.zzayy, com.google.android.libraries.places.internal.zzayz
    final byte zzb(int i) {
        return ((zzayy) this).zza[i];
    }

    @Override // com.google.android.libraries.places.internal.zzayy
    protected final int zzd() {
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zzayy, com.google.android.libraries.places.internal.zzayz
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((zzayy) this).zza[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 11);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.libraries.places.internal.zzayy, com.google.android.libraries.places.internal.zzayz
    public final int zzc() {
        return this.zzc;
    }
}
