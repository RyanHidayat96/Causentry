package com.google.android.libraries.places.internal;

import android.os.SystemClock;
import java.time.Duration;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfa {
    static {
        new zzfa();
    }

    private zzfa() {
        SystemClock.elapsedRealtime();
        Duration.ofMillis(SystemClock.uptimeMillis()).toMillis();
    }

    public static zzfa zza() {
        return new zzfa();
    }
}
