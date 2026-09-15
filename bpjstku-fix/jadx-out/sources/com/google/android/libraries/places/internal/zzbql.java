package com.google.android.libraries.places.internal;

import defpackage.notifyOnConfigureAvailableListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbql implements Runnable {
    private static final Logger zza = Logger.getLogger(zzbql.class.getName());
    private final Runnable zzb;

    public zzbql(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("task");
        }
        this.zzb = runnable;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 22);
        sb.append("LogExceptionRunnable(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.run();
        } catch (Throwable th) {
            zza.logp(Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(String.valueOf(String.valueOf(this.zzb))), th);
            notifyOnConfigureAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th);
            throw new AssertionError(th);
        }
    }
}
