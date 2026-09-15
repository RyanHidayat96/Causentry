package com.google.android.libraries.places.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes6.dex */
public final class zztv {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zztz zzb;

    static {
        zztz zzuaVar;
        for (int i = 0; i < 2; i++) {
            try {
                zzuaVar = (zztz) Class.forName(zza[i]).asSubclass(zztz.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                zzuaVar = null;
            }
            if (zzuaVar != null) {
                zzb = zzuaVar;
            }
        }
        zzuaVar = new zzua();
        zzb = zzuaVar;
    }

    public static StackTraceElement zza(Class cls, int i) {
        zztw.zza(cls, TypedValues.AttributesType.S_TARGET);
        return zzb.zza(cls, 2);
    }
}
