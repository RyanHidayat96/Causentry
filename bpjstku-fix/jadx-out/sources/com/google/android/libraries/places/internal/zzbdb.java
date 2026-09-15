package com.google.android.libraries.places.internal;

import defpackage.CameraStateRegistryCameraRegistration;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdb {
    public static final /* synthetic */ int zza = 0;
    private static final ThreadLocal zzb;

    static {
        zzbcj zzbcjVarZzf = zzbck.zzf();
        zzbcjVarZzf.zza(-62135596800L);
        zzbcjVarZzf.zzb(0);
        zzbcj zzbcjVarZzf2 = zzbck.zzf();
        zzbcjVarZzf2.zza(253402300799L);
        zzbcjVarZzf2.zzb(999999999);
        zzbcj zzbcjVarZzf3 = zzbck.zzf();
        zzbcjVarZzf3.zza(0L);
        zzbcjVarZzf3.zzb(0);
        zzb = new zzbda();
        zzb("now");
        zzb("getEpochSecond");
        zzb("getNano");
    }

    public static String zza(zzbck zzbckVar) {
        String str;
        long jZzc = zzbckVar.zzc();
        int iZze = zzbckVar.zze();
        if (jZzc < -62135596800L || jZzc > 253402300799L || iZze < 0 || iZze >= 1000000000) {
            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(jZzc), Integer.valueOf(iZze)));
        }
        long jZzc2 = zzbckVar.zzc();
        int iZze2 = zzbckVar.zze();
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) zzb.get()).format(new Date(jZzc2 * 1000)));
        if (iZze2 != 0) {
            sb.append(".");
            if (iZze2 % 1000000 == 0) {
                str = String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(iZze2 / 1000000));
            } else {
                str = iZze2 % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(iZze2 / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(iZze2));
            }
            sb.append(str);
        }
        sb.append("Z");
        return sb.toString();
    }

    private static Method zzb(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
