package com.google.android.libraries.places.internal;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class zzcbi extends zzccb {
    private static final ReentrantLock zza;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        zza = reentrantLock;
        Intrinsics.checkNotNullExpressionValue(reentrantLock.newCondition(), "");
        TimeUnit.MILLISECONDS.toNanos(TimeUnit.SECONDS.toMillis(60L));
    }

    public static final boolean zza() {
        ReentrantLock reentrantLock = zza;
        reentrantLock.lock();
        reentrantLock.unlock();
        return false;
    }
}
