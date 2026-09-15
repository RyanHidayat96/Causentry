package com.google.android.libraries.places.internal;

import android.os.Build;
import dalvik.system.VMStack;

/* JADX INFO: loaded from: classes6.dex */
public final class zzta extends zzsw {
    private static final boolean zza = zza.zza();
    private static final boolean zzb;
    private static final zzsv zzc;

    final class zza {
        static boolean zza() {
            return zzta.zzp();
        }

        zza() {
        }
    }

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        zzb = z;
        zzc = new zzsv() { // from class: com.google.android.libraries.places.internal.zzta.1
            @Override // com.google.android.libraries.places.internal.zzsv
            public String zza(Class cls) {
                StackTraceElement stackTraceElementZza;
                if (zzta.zza) {
                    try {
                        if (cls.equals(zzta.zzr())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!zzta.zzb || (stackTraceElementZza = zztv.zza(cls, 1)) == null) {
                    return null;
                }
                return stackTraceElementZza.getClassName();
            }

            @Override // com.google.android.libraries.places.internal.zzsv
            public zzsc zzb(Class<?> cls, int i) {
                return zzsc.zza;
            }
        };
    }

    static boolean zzp() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            return zza.class.getName().equals(zzq());
        } catch (Throwable unused) {
            return false;
        }
    }

    static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> zzr() {
        return VMStack.getStackClass2();
    }

    @Override // com.google.android.libraries.places.internal.zzsw
    protected final zzsh zze(String str) {
        return zzte.zzb(str);
    }

    @Override // com.google.android.libraries.places.internal.zzsw
    protected final zztj zzg() {
        return zztf.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzsw
    protected final zzsv zzc() {
        return zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzsw
    protected final String zzn() {
        return "platform: Android";
    }
}
