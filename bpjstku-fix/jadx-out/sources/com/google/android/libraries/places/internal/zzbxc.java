package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
final class zzbxc implements zzbwd {
    @Override // com.google.android.libraries.places.internal.zzbwd
    public final /* synthetic */ void zza(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final /* synthetic */ Object zzb() {
        return Executors.newCachedThreadPool(zzbpf.zzd("grpc-okhttp-%d", true));
    }

    zzbxc() {
    }
}
