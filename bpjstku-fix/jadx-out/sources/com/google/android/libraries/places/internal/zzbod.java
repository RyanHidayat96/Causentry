package com.google.android.libraries.places.internal;

import defpackage.isCameraClosing;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbod implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzboh zzb;

    zzbod(zzboh zzbohVar, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzbohVar);
        this.zzb = zzbohVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza) {
            zzbok zzbokVar = this.zzb.zza;
            zzbokVar.zzf = true;
            if (zzbokVar.zzi() > 0) {
                isCameraClosing iscameraclosingZzk = zzbokVar.zzk();
                iscameraclosingZzk.TuitionPaymentFragmentbindingInflater1 = 0L;
                iscameraclosingZzk.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
                if (!(!iscameraclosingZzk.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                    throw new IllegalStateException("This stopwatch is already running.");
                }
                iscameraclosingZzk.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                iscameraclosingZzk.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iscameraclosingZzk.b.b();
            }
        }
        this.zzb.zza.zzl(false);
    }
}
