package com.google.android.libraries.places.internal;

import android.content.Context;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ConstantObservableExternalSyntheticLambda0;
import defpackage.getCloseFuture;
import defpackage.removeObserver;
import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
final class zzjm {
    String zza;
    Long zzb;
    zzbdd zzc;
    private final Context zzd;
    private final zzjf zze;
    private final zzbdg zzf;
    private final zzir zzg;
    private boolean zzh = false;
    private final zzmf zzi;

    zzjm(Context context, zzbif zzbifVar, zzmf zzmfVar, zzir zzirVar, zzjf zzjfVar) {
        this.zzd = context;
        this.zzf = zzbdh.zzc(zzbifVar);
        this.zzg = zzirVar;
        this.zzi = zzmfVar;
        this.zze = zzjfVar;
    }

    public final ListenableFuture zza(final zzbdd zzbddVar) {
        if (zzbddVar == zzbdd.PLACE_AUTOCOMPLETE) {
            throw new IllegalArgumentException("Autocomplete widget should call getOrRefreshToken()");
        }
        if (this.zza != null && zze()) {
            throw new IllegalStateException("Token is expired");
        }
        zzbdd zzbddVar2 = this.zzc;
        if (zzbddVar2 != null && zzbddVar2 != zzbddVar) {
            throw new IllegalArgumentException(String.format("Token type %s does not match requested type %s", zzbddVar2.name(), zzbddVar.name()));
        }
        String str = this.zza;
        return str != null ? getCloseFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str) : (removeObserver) getCloseFuture.TuitionPaymentFragmentbindingInflater1((removeObserver) getCloseFuture.b(removeObserver.TuitionPaymentFragmentbindingInflater1(this.zze.zza()), new ConstantObservableExternalSyntheticLambda0() { // from class: com.google.android.libraries.places.internal.zzjl
            @Override // defpackage.ConstantObservableExternalSyntheticLambda0
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return this.zza.zzd((String) obj, zzbddVar);
            }
        }, DirectExecutor.INSTANCE), zzjj.zza, DirectExecutor.INSTANCE);
    }

    public final ListenableFuture zzb(zzbdd zzbddVar) {
        String str;
        if (zzbddVar != zzbdd.PLACE_AUTOCOMPLETE) {
            throw new IllegalArgumentException("Only Autocomplete widget should call getOrRefreshToken()");
        }
        zzbdd zzbddVar2 = this.zzc;
        if (zzbddVar2 == null || zzbddVar2 == zzbddVar) {
            return (zze() || (str = this.zza) == null) ? (removeObserver) getCloseFuture.TuitionPaymentFragmentbindingInflater1((removeObserver) getCloseFuture.b(removeObserver.TuitionPaymentFragmentbindingInflater1(this.zze.zza()), new zzjk(this, zzbddVar), DirectExecutor.INSTANCE), zzji.zza, DirectExecutor.INSTANCE) : getCloseFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        }
        throw new IllegalArgumentException(String.format("Token type %s does not match requested type %s", zzbddVar2.name(), zzbddVar.name()));
    }

    final ListenableFuture zzd(String str, zzbdd zzbddVar) {
        if (this.zzh) {
            throw new IllegalStateException("Too many concurrent requests");
        }
        this.zzh = true;
        zzbdc zzbdcVarZzc = zzbde.zzc();
        zzbdcVarZzc.zza(zzbddVar);
        zzbdcVarZzc.zzb(str);
        zzbdcVarZzc.zzc(this.zzd.getPackageName());
        zzbdcVarZzc.zzd(4);
        zzbde zzbdeVar = (zzbde) zzbdcVarZzc.zzG();
        zzbdg zzbdgVar = (zzbdg) this.zzf.zze(zzcam.zza(this.zzg.zza(this.zzi.zzf(), "")));
        ListenableFuture listenableFutureZzb = zzcaj.zzb(zzbdgVar.zzc().zza(zzbdh.zzb(), zzbdgVar.zzd()), zzbdeVar);
        getCloseFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(listenableFutureZzb, new zzjh(this, zzbddVar), DirectExecutor.INSTANCE);
        return listenableFutureZzb;
    }

    final boolean zze() {
        Long l = this.zzb;
        if (l == null) {
            return true;
        }
        return Instant.ofEpochSecond(l.longValue()).isBefore(Instant.now());
    }

    public final void zzc() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    final /* synthetic */ void zzf(boolean z) {
        this.zzh = false;
    }
}
