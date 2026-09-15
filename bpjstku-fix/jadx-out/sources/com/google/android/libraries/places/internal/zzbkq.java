package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbkq implements zzbwh {
    private static final Logger zza = Logger.getLogger(zzbkq.class.getName());

    protected abstract zzbow zzh();

    protected abstract zzbkp zzp();

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzr() {
        zzp().zzl();
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzs(int i) {
        zzbkp zzbkpVarZzp = zzp();
        zzbkpVarZzp.zzy(new zzbko(zzbkpVarZzp, zzcba.zzb(), i));
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzt(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("message");
        }
        try {
            if (!zzh().zzc()) {
                zzh().zza(inputStream);
            }
        } finally {
            zzbpf.zzh(inputStream);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzu() {
        if (zzh().zzc()) {
            return;
        }
        zzh().zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzv(zzbfu zzbfuVar) {
        zzbow zzbowVarZzh = zzh();
        if (zzbfuVar == null) {
            throw new NullPointerException("compressor");
        }
        zzbowVarZzh.zze(zzbfuVar);
    }

    protected final void zzw(int i) {
        zzp().zzw(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public boolean zzm() {
        throw null;
    }
}
