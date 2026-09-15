package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes6.dex */
public final class zzti extends zzsx {
    public static final /* synthetic */ int zza = 0;
    private static final Set zzb;
    private static final zzsq zzc;
    private static final zztg zzd;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzsa.zza, zzsf.zza, zzsg.zza)));
        zzb = setUnmodifiableSet;
        zzc = zzst.zza(setUnmodifiableSet).zzb();
        zzd = new zztg(null);
    }

    /* synthetic */ zzti(String str, String str2, boolean z, int i, Level level, Set set, zzsq zzsqVar, byte[] bArr) {
        super(str2);
    }

    public static zztg zzb() {
        return zzd;
    }
}
