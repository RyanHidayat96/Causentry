package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
final class zzsu {
    private static final zzsw zza = zzb(zzsw.zzd);

    private static zzsw zzb(String[] strArr) {
        zzta zztaVar;
        try {
            zztaVar = zztb.zza;
        } catch (NoClassDefFoundError unused) {
            zztaVar = null;
        }
        if (zztaVar != null) {
            return zztaVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zzsw) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                th = th;
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
