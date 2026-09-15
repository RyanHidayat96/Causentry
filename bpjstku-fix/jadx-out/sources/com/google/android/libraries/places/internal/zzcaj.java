package com.google.android.libraries.places.internal;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcaj {
    static final zzbfc zza;
    private static final Logger zzb = Logger.getLogger(zzcaj.class.getName());

    static {
        String str = System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE");
        if (str != null && !str.isEmpty()) {
            System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE");
        }
        zza = zzbfc.zza("internal-stub-type");
    }

    public static ListenableFuture zzb(zzbfi zzbfiVar, Object obj) {
        zzcae zzcaeVar = new zzcae(zzbfiVar);
        zzd(zzbfiVar, obj, new zzcai(zzcaeVar));
        return zzcaeVar;
    }

    private static RuntimeException zzc(zzbfi zzbfiVar, Throwable th) {
        try {
            zzbfiVar.zze(null, th);
        } catch (Error | RuntimeException e2) {
            zzb.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e2);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new AssertionError(th);
    }

    private static void zzd(zzbfi zzbfiVar, Object obj, zzcaf zzcafVar) {
        zzbfiVar.zza(zzcafVar, new zzbip());
        zzcafVar.zze();
        try {
            zzbfiVar.zzb(obj);
            zzbfiVar.zzd();
        } catch (Error | RuntimeException e2) {
            throw zzc(zzbfiVar, e2);
        }
    }

    public static void zza(zzbfi zzbfiVar, Object obj, zzcan zzcanVar) {
        if (zzcanVar == null) {
            throw new NullPointerException("responseObserver");
        }
        zzd(zzbfiVar, obj, new zzcag(zzcanVar, new zzcad(zzbfiVar, false)));
    }

    private zzcaj() {
    }
}
