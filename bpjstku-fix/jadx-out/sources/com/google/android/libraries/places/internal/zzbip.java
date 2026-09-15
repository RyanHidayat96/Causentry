package com.google.android.libraries.places.internal;

import com.google.common.io.BaseEncoding;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbip {
    private Object[] zzd;
    private int zze;
    private static final Logger zzc = Logger.getLogger(zzbip.class.getName());
    public static final zzbik zza = new zzbii();
    static final BaseEncoding zzb = BaseEncoding.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    private final byte[] zzh(int i) {
        return (byte[]) this.zzd[i + i];
    }

    private final Object zzi(int i) {
        return this.zzd[i + i + 1];
    }

    private final byte[] zzj(int i) {
        Object objZzi = zzi(i);
        if (objZzi instanceof byte[]) {
            return (byte[]) objZzi;
        }
        throw null;
    }

    private final void zzm(int i) {
        Object[] objArr = new Object[i];
        if (!zzl()) {
            Object[] objArr2 = this.zzd;
            int i2 = this.zze;
            System.arraycopy(objArr2, 0, objArr, 0, i2 + i2);
        }
        this.zzd = objArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.zze; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(zzh(i), StandardCharsets.US_ASCII);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                BaseEncoding baseEncoding = zzb;
                byte[] bArrZzj = zzj(i);
                sb.append(baseEncoding.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArrZzj, bArrZzj.length));
            } else {
                sb.append(new String(zzj(i), StandardCharsets.US_ASCII));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final Object zzb(zzbil zzbilVar) {
        int i = this.zze;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(zzbilVar.zze(), zzh(i)));
        Object objZzi = zzi(i);
        if (objZzi instanceof byte[]) {
            return zzbilVar.zzb((byte[]) objZzi);
        }
        throw null;
    }

    public final void zzd(zzbil zzbilVar) {
        if (zzl()) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.zze;
            if (i >= i3) {
                Arrays.fill(this.zzd, i2 + i2, i3 + i3, (Object) null);
                this.zze = i2;
                return;
            }
            if (!Arrays.equals(zzbilVar.zze(), zzh(i))) {
                int i4 = i2 + i2;
                this.zzd[i4] = zzh(i);
                Object objZzi = zzi(i);
                if (this.zzd instanceof byte[][]) {
                    zzm(zzk());
                }
                this.zzd[i4 + 1] = objZzi;
                i2++;
            }
            i++;
        }
    }

    final byte[][] zze() {
        int i = this.zze;
        int i2 = i + i;
        byte[][] bArr = new byte[i2][];
        Object[] objArr = this.zzd;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i2);
            return bArr;
        }
        for (int i3 = 0; i3 < this.zze; i3++) {
            int i4 = i3 + i3;
            bArr[i4] = zzh(i3);
            bArr[i4 + 1] = zzj(i3);
        }
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final void zzf(zzbip zzbipVar) {
        if (zzbipVar.zzl()) {
            return;
        }
        int iZzk = zzk();
        int i = this.zze;
        int i2 = i + i;
        if (zzl()) {
            int i3 = zzbipVar.zze;
            zzm(i2 + i3 + i3);
        } else {
            int i4 = zzbipVar.zze;
            if (iZzk - i2 < i4 + i4) {
                int i5 = zzbipVar.zze;
                zzm(i2 + i5 + i5);
            }
        }
        Object[] objArr = zzbipVar.zzd;
        Object[] objArr2 = this.zzd;
        int i6 = this.zze;
        int i7 = zzbipVar.zze;
        System.arraycopy(objArr, 0, objArr2, i6 + i6, i7 + i7);
        this.zze += zzbipVar.zze;
    }

    public final void zzc(zzbil zzbilVar, Object obj) {
        if (zzbilVar == null) {
            throw new NullPointerException("key");
        }
        if (obj == null) {
            throw new NullPointerException("value");
        }
        int i = this.zze;
        int i2 = i + i;
        if (i2 == 0 || i2 == zzk()) {
            zzm(Math.max(i2 + i2, 8));
        }
        int i3 = this.zze;
        this.zzd[i3 + i3] = zzbilVar.zze();
        int i4 = this.zze;
        this.zzd[i4 + i4 + 1] = zzbilVar.zza(obj);
        this.zze++;
    }

    public zzbip() {
    }

    zzbip(int i, Object[] objArr) {
        this.zze = i;
        this.zzd = objArr;
    }

    private final int zzk() {
        Object[] objArr = this.zzd;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final boolean zzl() {
        return this.zze == 0;
    }

    final int zza() {
        return this.zze;
    }
}
