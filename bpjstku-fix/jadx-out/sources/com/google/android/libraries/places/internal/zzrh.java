package com.google.android.libraries.places.internal;

import java.util.HashMap;
import java.util.Random;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrh {
    public static final /* synthetic */ int zza = 0;

    static {
        new Random().nextInt();
        new HashMap();
    }

    @JvmStatic
    public static final Runnable zza(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "");
        return new zzrg(new Ref.ObjectRef(), zzqj.zzb(false), runnable);
    }
}
