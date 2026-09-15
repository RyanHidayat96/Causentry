package com.google.android.gms.internal.mlkit_common;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
final class zzab {
    private static final Logger zza = Logger.getLogger(zzab.class.getName());
    private static final zzaa zzb = new zzaa(null);

    static boolean zzb(String str) {
        return str == null || str.isEmpty();
    }

    private zzab() {
    }

    static String zza(String str) {
        return str == null ? "" : str;
    }
}
