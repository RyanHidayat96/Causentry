package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class zzayy extends zzayx {
    protected final byte[] zza;

    zzayy(byte[] bArr) {
        super(null);
        this.zza = bArr;
    }

    @Override // com.google.android.libraries.places.internal.zzayz
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzayz) || zzc() != ((zzayz) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzayy)) {
            return obj.equals(this);
        }
        zzayy zzayyVar = (zzayy) obj;
        int iZzi = zzi();
        int iZzi2 = zzayyVar.zzi();
        if (iZzi != 0 && iZzi2 != 0 && iZzi != iZzi2) {
            return false;
        }
        int iZzc = zzc();
        if (iZzc > zzayyVar.zzc()) {
            int iZzc2 = zzc();
            StringBuilder sb = new StringBuilder(String.valueOf(iZzc).length() + 18 + String.valueOf(iZzc2).length());
            sb.append("Length too large: ");
            sb.append(iZzc);
            sb.append(iZzc2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (iZzc > zzayyVar.zzc()) {
            int iZzc3 = zzayyVar.zzc();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzc).length() + 27 + String.valueOf(iZzc3).length());
            sb2.append("Ran off end of other: 0, ");
            sb2.append(iZzc);
            sb2.append(", ");
            sb2.append(iZzc3);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(zzayyVar instanceof zzayy)) {
            return zzayyVar.zze(0, iZzc).equals(zze(0, iZzc));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzayyVar.zza;
        zzayyVar.zzd();
        int i = 0;
        int i2 = 0;
        while (i < iZzc) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzayz
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.libraries.places.internal.zzayz
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzd() {
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zzayz
    public final zzayz zze(int i, int i2) {
        int iZzj = zzj(0, i2, zzc());
        return iZzj == 0 ? zzayz.zzb : new zzayv(this.zza, 0, iZzj);
    }

    @Override // com.google.android.libraries.places.internal.zzayz
    final void zzf(zzays zzaysVar) throws IOException {
        zzaysVar.zza(this.zza, 0, zzc());
    }

    @Override // com.google.android.libraries.places.internal.zzayz
    protected final int zzg(int i, int i2, int i3) {
        return zzbap.zzc(i, this.zza, 0, i3);
    }

    @Override // com.google.android.libraries.places.internal.zzayz
    public int zzc() {
        return this.zza.length;
    }
}
