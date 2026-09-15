package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbeo implements zzbes {
    private static final Object zza = new Object();
    private volatile zzbes zzb;
    private volatile Object zzc = zza;

    private final Object zzc() {
        synchronized (this) {
            Object obj = this.zzc;
            Object obj2 = zza;
            if (obj != obj2) {
                return obj;
            }
            Object objZzb = this.zzb.zzb();
            Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != objZzb) {
                StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
                sb.append(obj3);
                sb.append(" & ");
                sb.append(objZzb);
                sb.append(". This is likely due to a circular dependency.");
                throw new IllegalStateException(sb.toString());
            }
            this.zzc = objZzb;
            this.zzb = null;
            return objZzb;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcbd
    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzc() : obj;
    }

    private zzbeo(zzbes zzbesVar) {
        this.zzb = zzbesVar;
    }

    public static zzbes zza(zzbes zzbesVar) {
        return zzbesVar instanceof zzbeo ? zzbesVar : new zzbeo(zzbesVar);
    }
}
