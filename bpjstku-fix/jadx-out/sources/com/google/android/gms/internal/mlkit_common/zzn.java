package com.google.android.gms.internal.mlkit_common;

import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
final class zzn {
    private static final Method zza;
    private static final Method zzb;
    private static final Method zzc;
    private static final Field zzd;
    private static final Field zze;
    private static final Field zzf;
    private static final Object zzg;
    private static final Throwable zzh;

    static {
        Method declaredMethod;
        Method declaredMethod2;
        Method declaredMethod3;
        Throwable th;
        Object obj;
        Field field;
        Field field2;
        Field field3;
        Throwable th2;
        try {
            Class<?> cls = Class.forName("libcore.io.Libcore");
            Class<?> cls2 = Class.forName("libcore.io.StructStat");
            Class<?> cls3 = Class.forName("libcore.io.OsConstants");
            Class<?> cls4 = Class.forName("libcore.io.ForwardingOs");
            declaredMethod = cls3.getDeclaredMethod("S_ISLNK", Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod3 = cls4.getDeclaredMethod("lstat", String.class);
                try {
                    declaredMethod2 = cls4.getDeclaredMethod("fstat", FileDescriptor.class);
                    try {
                        Field declaredField = cls.getDeclaredField("os");
                        declaredField.setAccessible(true);
                        obj = declaredField.get(cls);
                        try {
                            field2 = cls2.getField("st_dev");
                            try {
                                field3 = cls2.getField("st_ino");
                                try {
                                    field = cls2.getField("st_mode");
                                    try {
                                        field2.setAccessible(true);
                                        field3.setAccessible(true);
                                        field.setAccessible(true);
                                        zza = declaredMethod;
                                        zzb = declaredMethod3;
                                        zzc = declaredMethod2;
                                        zzd = field2;
                                        zze = field3;
                                        zzf = field;
                                        zzg = obj;
                                        zzh = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            Log.d("StructStatHelper", "Reflection failed", th);
                                            zza = declaredMethod;
                                            zzb = declaredMethod3;
                                            zzc = declaredMethod2;
                                            zzd = field2;
                                            zze = field3;
                                            zzf = field;
                                            zzg = obj;
                                            zzh = th;
                                        } catch (Throwable th4) {
                                            zza = declaredMethod;
                                            zzb = declaredMethod3;
                                            zzc = declaredMethod2;
                                            zzd = field2;
                                            zze = field3;
                                            zzf = field;
                                            zzg = obj;
                                            zzh = null;
                                            throw th4;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    field = null;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                field = null;
                                field3 = null;
                            }
                        } catch (Throwable th7) {
                            th2 = th7;
                            th = th2;
                            field = null;
                            field2 = null;
                            field3 = null;
                            Log.d("StructStatHelper", "Reflection failed", th);
                            zza = declaredMethod;
                            zzb = declaredMethod3;
                            zzc = declaredMethod2;
                            zzd = field2;
                            zze = field3;
                            zzf = field;
                            zzg = obj;
                            zzh = th;
                        }
                    } catch (Throwable th8) {
                        th2 = th8;
                        obj = null;
                    }
                } catch (Throwable th9) {
                    declaredMethod2 = null;
                    th = th9;
                    obj = null;
                }
            } catch (Throwable th10) {
                th = th10;
                declaredMethod2 = null;
                declaredMethod3 = null;
                th = th;
                obj = null;
                field = null;
                field2 = null;
                field3 = null;
                Log.d("StructStatHelper", "Reflection failed", th);
                zza = declaredMethod;
                zzb = declaredMethod3;
                zzc = declaredMethod2;
                zzd = field2;
                zze = field3;
                zzf = field;
                zzg = obj;
                zzh = th;
            }
        } catch (Throwable th11) {
            th = th11;
            declaredMethod = null;
        }
    }

    static zzp zza(final FileDescriptor fileDescriptor) throws IOException {
        return (zzp) zzf(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzn.zze(zzn.zzc.invoke(zzn.zzg, fileDescriptor));
            }
        });
    }

    static zzp zzd(final String str) throws IOException {
        return (zzp) zzf(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzn.zze(zzn.zzb.invoke(zzn.zzg, str));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzp zze(Object obj) throws Exception {
        return new zzp(((Long) zzd.get(obj)).longValue(), ((Long) zze.get(obj)).longValue(), ((Boolean) zza.invoke(null, Integer.valueOf(((Integer) zzf.get(obj)).intValue()))).booleanValue());
    }

    private static Object zzf(Callable callable) throws IOException {
        try {
            Throwable th = zzh;
            if (th == null) {
                return callable.call();
            }
            throw new IOException(th);
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }
}
