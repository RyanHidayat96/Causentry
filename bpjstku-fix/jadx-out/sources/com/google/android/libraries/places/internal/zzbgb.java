package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
final class zzbgb {
    static final zzbgc zza;

    static {
        zzbgc zzbkeVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            zzbkeVar = (zzbgc) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(zzbgc.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e2) {
            atomicReference.set(e2);
            zzbkeVar = new zzbke();
        } catch (Exception e3) {
            throw new RuntimeException("Storage override failed to initialize", e3);
        }
        zza = zzbkeVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            zzbgd.zza.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
