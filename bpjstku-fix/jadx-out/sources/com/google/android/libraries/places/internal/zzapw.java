package com.google.android.libraries.places.internal;

import com.google.common.util.concurrent.DirectExecutor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class zzapw implements Executor {
    private volatile Executor zza;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    public final void zza() {
        this.zza = DirectExecutor.INSTANCE;
    }

    public zzapw(Executor executor) {
        this.zza = executor;
    }
}
