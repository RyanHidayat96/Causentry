package com.google.android.libraries.places.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpb {
    private final zzaju zza;
    private final List zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final zzajp zze;
    private final zzajz zzf;
    private zzoz zzg;
    private zzajw zzh;

    private final void zzg(int i) {
        zzajn zzajnVarZza = zzajx.zza();
        zzajnVarZza.zzh(i);
        zzajnVarZza.zza(this.zza);
        zzajnVarZza.zzb(this.zzb);
        zzajnVarZza.zzc(this.zzh);
        zzajnVarZza.zzd(this.zzc);
        zzajnVarZza.zze(this.zzd);
        zzajnVarZza.zzf(this.zze);
        zzajnVarZza.zzg(this.zzf);
        zzbae zzbaeVarZzG = zzajnVarZza.zzG();
        Intrinsics.checkNotNullExpressionValue(zzbaeVarZzG, "");
        zzajx zzajxVar = (zzajx) zzbaeVarZzG;
        zzoz zzozVar = this.zzg;
        if (zzozVar != null) {
            zzozVar.zzc(zzajxVar);
        }
    }

    public final void zzc() {
        zzg(2);
    }

    public final void zzd() {
        zzg(3);
    }

    public final void zze() {
        zzg(4);
    }

    public final void zzf() {
        zzg(5);
    }

    public zzpb(zzaju zzajuVar, List list, boolean z, boolean z2, zzajp zzajpVar, zzajz zzajzVar) {
        Intrinsics.checkNotNullParameter(zzajuVar, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(zzajpVar, "");
        Intrinsics.checkNotNullParameter(zzajzVar, "");
        this.zza = zzajuVar;
        this.zzb = list;
        this.zzc = z;
        this.zzd = z2;
        this.zze = zzajpVar;
        this.zzf = zzajzVar;
        this.zzh = zzajw.UNDEFINED;
    }

    public final void zza(zzoz zzozVar) {
        this.zzg = zzozVar;
    }

    public final void zzb(zzajw zzajwVar) {
        Intrinsics.checkNotNullParameter(zzajwVar, "");
        this.zzh = zzajwVar;
    }
}
