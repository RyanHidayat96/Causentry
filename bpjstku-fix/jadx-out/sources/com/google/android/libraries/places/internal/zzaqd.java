package com.google.android.libraries.places.internal;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqd extends zzbgn {
    private final AtomicReference zza;

    public zzaqd(zzbfi zzbfiVar) {
        super(zzbfiVar);
        this.zza = new AtomicReference(zzaqc.zzb(1));
    }

    @Override // com.google.android.libraries.places.internal.zzbgo, com.google.android.libraries.places.internal.zzbfi
    public final void zza(zzbfh zzbfhVar, zzbip zzbipVar) {
        AtomicReference atomicReference;
        zzaqc zzaqcVar;
        do {
            atomicReference = this.zza;
            zzaqcVar = (zzaqc) atomicReference.get();
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, zzaqcVar, zzaqcVar.zzd() == 1 ? zzaqc.zzb(2) : zzaqcVar));
        if (zzaqcVar.zzd() == 1) {
            zzf().zza(zzbfhVar, zzbipVar);
        } else if (zzaqcVar.zzd() == 4) {
            zzbfhVar.zzc(zzaqcVar.zza(), new zzbip());
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Already started");
            zzf().zze("start() called more than once", illegalStateException);
            throw illegalStateException;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgo, com.google.android.libraries.places.internal.zzbfi
    public final void zzb(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Message must be non-null");
        }
        int iZzd = ((zzaqc) this.zza.get()).zzd();
        if (iZzd == 2) {
            zzf().zzb(obj);
        } else if (iZzd != 5) {
            throw new IllegalStateException("Call was either not started or already half-closed.");
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbjk, com.google.android.libraries.places.internal.zzbfi
    public final void zzc(int i) {
        zzaqc zzaqcVar = (zzaqc) this.zza.get();
        if (zzaqcVar.zzd() == 1 || zzaqcVar.zzd() == 4) {
            throw new IllegalStateException("Not started");
        }
        zzf().zzc(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbjk, com.google.android.libraries.places.internal.zzbfi
    public final void zzd() {
        AtomicReference atomicReference;
        zzaqc zzaqcVar;
        do {
            atomicReference = this.zza;
            zzaqcVar = (zzaqc) atomicReference.get();
            if (zzaqcVar.zzd() != 2) {
                throw new IllegalStateException("Call was either not started or already half-closed.");
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, zzaqcVar, zzaqc.zzb(3)));
        zzf().zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbjk, com.google.android.libraries.places.internal.zzbfi
    public final void zze(String str, Throwable th) {
        AtomicReference atomicReference;
        zzaqc zzaqcVar;
        zzaqc zzaqcVarZzc;
        zzbjv zzbjvVarZzd = zzbjv.zzb;
        if (str != null) {
            zzbjvVarZzd = zzbjvVarZzd.zze(str);
        }
        if (th != null) {
            zzbjvVarZzd = zzbjvVarZzd.zzd(th);
        }
        do {
            atomicReference = this.zza;
            zzaqcVar = (zzaqc) atomicReference.get();
            if (zzaqcVar.zzd() == 4) {
                zzaqcVarZzc = zzaqcVar;
            } else {
                zzaqcVarZzc = zzaqcVar.zzd() == 1 ? zzaqc.zzc(4, zzbjvVarZzd) : zzaqc.zzc(5, zzbjvVarZzd);
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, zzaqcVar, zzaqcVarZzc));
        zzf().zze(str, th);
    }
}
