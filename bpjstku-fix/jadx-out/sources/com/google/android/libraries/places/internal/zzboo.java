package com.google.android.libraries.places.internal;

import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes3.dex */
public final class zzboo extends zzbst {
    private boolean zzb;
    private final zzbjv zzc;
    private final zzbls zzd;
    private final zzbfp[] zze;

    public zzboo(zzbjv zzbjvVar, zzbls zzblsVar, zzbfp[] zzbfpVarArr) {
        if (!(!zzbjvVar.zzj())) {
            throw new IllegalArgumentException("error must not be OK");
        }
        this.zzc = zzbjvVar;
        this.zzd = zzblsVar;
        this.zze = zzbfpVarArr;
    }

    @Override // com.google.android.libraries.places.internal.zzbst, com.google.android.libraries.places.internal.zzblr
    public final void zzf(zzblt zzbltVar) {
        if (!(!this.zzb)) {
            throw new IllegalStateException("already started");
        }
        this.zzb = true;
        int i = 0;
        while (true) {
            zzbfp[] zzbfpVarArr = this.zze;
            if (i >= zzbfpVarArr.length) {
                zzbltVar.zzc(this.zzc, this.zzd, new zzbip());
                return;
            } else {
                zzbfp zzbfpVar = zzbfpVarArr[i];
                i++;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbst, com.google.android.libraries.places.internal.zzblr
    public final void zzn(zzbpl zzbplVar) {
        zzbplVar.zzb(Constants.IPC_BUNDLE_KEY_SEND_ERROR, this.zzc);
        zzbplVar.zzb("progress", this.zzd);
    }
}
