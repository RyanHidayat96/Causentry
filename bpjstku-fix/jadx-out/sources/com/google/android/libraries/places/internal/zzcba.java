package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcba {
    public static final /* synthetic */ int zza = 0;

    static {
        Class<?> cls;
        zzcay zzcayVar;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            th = null;
        } catch (Throwable th) {
            th = th;
            cls = null;
        }
        if (cls != null) {
            try {
                zzcayVar = (zzcay) cls.asSubclass(zzcay.class).getConstructor(zzcbb.class).newInstance(zzcay.zza);
            } catch (Throwable th2) {
                th = th2;
                zzcayVar = null;
            }
        } else {
            zzcayVar = null;
        }
        if (zzcayVar == null) {
            new zzcay(zzcay.zza);
        }
        if (th != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, zzcba.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", th);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private zzcba() {
    }

    public static zzcbb zza(String str) {
        return zzcay.zza;
    }

    public static zzcaz zzb() {
        return zzcay.zzb;
    }
}
