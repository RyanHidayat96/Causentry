package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.LazyInstanceMap;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* JADX INFO: loaded from: classes6.dex */
final class zzna extends LazyInstanceMap {
    private zzna() {
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    public final /* synthetic */ Object create(Object obj) {
        zzmj zzmjVar = (zzmj) obj;
        MlKitContext mlKitContext = MlKitContext.getInstance();
        return new zzmq(mlKitContext.getApplicationContext(), (SharedPrefManager) mlKitContext.get(SharedPrefManager.class), new zzmk(MlKitContext.getInstance().getApplicationContext(), zzmjVar), zzmjVar.zzb());
    }

    /* synthetic */ zzna(zzmz zzmzVar) {
    }
}
